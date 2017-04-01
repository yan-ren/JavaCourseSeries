package annotationScanner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class AnnotationScanner {

	/*
	 * @org.testng.annotations.Test
	 * 
	 * @Target(value={CONSTRUCTOR, METHOD, TYPE})
	 * 
	 * @Retention(value=RUNTIME)
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Pattern pattern = Pattern.compile("\\d+");
		int wip = 0;
		int p0 = 0;
		int reg = 0;
		List<String> wipList = new ArrayList<>();
		List<String> p0List = new ArrayList<>();
		List<String> regList = new ArrayList<>();

		Class<?>[] allClasses = getClasses("com.kronos.scheduling.testcases");
		for (Class<?> eachClass : allClasses) {

			List<Method> allMethods = new ArrayList<Method>(Arrays.asList(eachClass.getDeclaredMethods()));
			for (Method method : allMethods) {
				if (method.isAnnotationPresent(Test.class)) {
					Test annotInstance = method.getAnnotation(Test.class);
					String methodName = method.getName();
					
					if (Arrays.asList(annotInstance.groups()).contains("WIP")) {
						try {
							Matcher matcher = pattern.matcher(methodName);
							matcher.find();
							String i = matcher.group();
							wipList.add(i + "," + methodName + "," + "WIP");
						} catch (Exception e) {
							e.printStackTrace();
						}
						// wipList.add("class: " + eachClass.getName());
						// wipList.add("method: " + method.getName());
						// wipList.add("***************************");
						wip++;
					} else if (Arrays.asList(annotInstance.groups()).contains("P0")) {
						try {
							Matcher matcher = pattern.matcher(methodName);
							matcher.find();
							String i = matcher.group();
							wipList.add(i + "," + methodName + "," + "P0");
						} catch (Exception e) {
							e.printStackTrace();
						}
						// p0List.add("class: " + eachClass.getName());
						// p0List.add("method: " + method.getName());
						// p0List.add("***************************");
						p0++;
					} else if (Arrays.asList(annotInstance.groups()).contains("Regression")) {
						try {
							Matcher matcher = pattern.matcher(methodName);
							matcher.find();
							String i = matcher.group();
							wipList.add(i + "," + methodName + "," + "Regression");
						} catch (Exception e) {
							e.printStackTrace();
						}
						// regList.add("class: " + eachClass.getName());
						// regList.add("method: " + method.getName());
						// regList.add("***************************");
						reg++;
					}
				}
			}
		}
		try (PrintWriter out = new PrintWriter("filename.csv")) {

			for (String item : wipList) {
				out.println(item);
			}

			for (String item : p0List) {
				out.println(item);
			}

			for (String item : regList) {
				out.println(item);
			}
		}
		System.out.println("WIP: " + wip + " ; P0: " + p0 + "; Regression: " + reg);
	}

	/**
	 * Scans all classes accessible from the context class loader which belong
	 * to the given package and subpackages.
	 * 
	 * @author Yan.Ren
	 * @param packageName
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private static Class<?>[] getClasses(String packageName) throws ClassNotFoundException, IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		assert classLoader != null;
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList<File>();
		while (resources.hasMoreElements()) {
			URL resource = resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}

		@SuppressWarnings("rawtypes")
		ArrayList<Class> classes = new ArrayList<>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and
	 * subdirs.
	 * 
	 * @author Yan.Ren
	 * @param directory
	 * @param packageName
	 * @return
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("rawtypes")
	private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(
						Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
			}
		}
		return classes;
	}

}
