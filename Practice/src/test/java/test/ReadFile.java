package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws Exception {

		new ReadFile().convert_file_to_string_java_bufferedreader();

	}

	public void ReadWithBufferedReader() throws IOException {
		String expected_value = "Hello world";
		String file = "src/test/resources/test_read.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String currentLine = reader.readLine();
		reader.close();
	}

	public void convert_file_to_string_java_bufferedreader() throws Exception {

		File file = new File("");
		BufferedReader br;

		br = new BufferedReader(new FileReader(file));
		StringBuffer fileContents = new StringBuffer();
		String line = br.readLine();
		while (line != null) {
			fileContents.append(line);
			line = br.readLine();
		}

		br.close();

	}

	public void ReadWithBufferedReader2() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\temp\\testfile.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	// read by scanner
	public void ReadWithScanner() {
		try {
			String filePath = "C:\\Users\\Administrator\\Desktop\\pic.jpg";
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter(" ");
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void whenReadSmallFileJava7() throws IOException {
		String expected_value = "Hello world";

		Path path = Paths.get("src/test/resources/test_read.txt");

		String read = Files.readAllLines(path).get(0);
		//
		List<String> lines = Files.readAllLines(Paths.get("c:\\temp\\testfile.txt"));
		for (String line : lines) {
			System.out.println(line);
		}
	}

	public void ReadLargeFileJava7() throws IOException {
		String expected_value = "Hello world";

		Path path = Paths.get("src/test/resources/test_read.txt");

		BufferedReader reader = Files.newBufferedReader(path);
		String line = reader.readLine();
		// assertEquals(expected_value, line);
	}

}
