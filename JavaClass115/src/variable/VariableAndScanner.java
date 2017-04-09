package variable;

import java.util.Scanner;

public class VariableAndScanner {
	public static void main(String[] args) {
		/*
		 * Type Description Default Size Example Literals boolean true or false
		 * false 1 bit true, false byte twos complement integer 0 8 bits (none)
		 * char Unicode character \u0000 16 bits 'a', '\u0041', '\101', '\\',
		 * '\'', '\n', 'ß' short twos complement integer 0 16 bits (none) int
		 * twos complement integer 0 32 bits -2, -1, 0, 1, 2 long twos
		 * complement integer 0 64 bits -2L, -1L, 0L, 1L, 2L float IEEE 754
		 * floating point 0.0 32 bits 1.23e100f, -1.23e-100f, .3f, 3.14F double
		 * IEEE 754 floating point 0.0 64 bits 1.23456e300d, -1.23456e-300d,
		 * 1e1d
		 */

		/*
		 * int aNumberForCalculation = 2; System.out.println("my number is " +
		 * aNumberForCalculation); char aLetter = 'a';
		 * System.out.println("my letter is " + aLetter);
		 * 
		 * double x = 2.10; float y = 212.2f;
		 * 
		 * boolean value = false; value = true;
		 * 
		 * String text = "hello from the class";
		 */

		// Scanner sc = new Scanner(System.in);
		// System.out.println("What's your name?");
		// String input = sc.nextLine();
		// // My name is xxxx
		// String[] token = input.split("is");
		// System.out.println("Hello"+ token[token.length-1]);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
////		int a = sc.nextLine();
//		System.out.println("Please enter another number: ");
//		int b = sc.nextInt();
//
//		if (a > b) {
//			System.out.println(a + " is greater than " + b);
//		} else if (a == b) {
//			System.out.println(a + " is equal to " + b);
//		} else {
//			System.out.println(a + " is smaller than " + b);
//		}

	}
}
