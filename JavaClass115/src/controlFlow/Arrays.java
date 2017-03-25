package controlFlow;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Arrays {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// double[] temperatures; // an array of doubles
		// int[] numbers; // an array of integers
		// boolean[] bools; // an array of booleans
		//
		// temperatures = new double[30];
		//
		// temperatures[0] = -14.5;
		//
		// System.out.println("First spot: " + temperatures[0]);
		//
		// int lastIndex = temperatures.length - 1;
		// double lastElement = temperatures[lastIndex];
		//
		// for (int i = 1; i < temperatures.length; i++) {
		// temperatures[i] = 1;
		// }
		//
		// temperatures[0] = -14.5;
		//
		// System.out.println("Temperatures");
		// for (int i = 0; i < temperatures.length; i++) {
		// System.out.print(temperatures[i] + " ");
		// }
		//
		//
		// String[] names = { "John", "Bentley", "Jackie" };
		// int[] moreNumbers = { 123, 574, 3, 239 };

		int[] numbers = { 20, 20, 1, 20, 40, 20, 90 };
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 20) {
				counter++;
			}
		}
		System.out.println("you have " + counter + " 20s");

		String text1 = "hello";
		String text2 = "hello";
		if (text1.equals(text2)) {

		}
		int a = 20;
		double b = (double) a;
		String c = Integer.toString(a);
		System.out.println(c);

		String[] stringArray = { "http://www.", "4399", ".com"};

		String result = "";
		for (String item : stringArray) {
			result = result + item;
		}
		System.out.println(result);

		URL url;
		InputStream is = null;
		DataInputStream ds;
		String s;

		try {
			url = new URL(result);
			is = url.openStream();
			ds = new DataInputStream(new BufferedInputStream(is));

			while ((s = ds.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}