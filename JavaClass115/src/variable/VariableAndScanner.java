package variable;

import java.util.Scanner;

public class VariableAndScanner {
	public static void main(String[] args) {
		// primitive data type 8
		// byte short int long
		// byte -128 -- 127
		// short -32768 - 32767 = -2^
		// char
		// double float
		// boolean
		
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String input = sc.nextLine();
		// My name is xxxx
		String[] token = input.split("is");
		System.out.println("Hello"+ token[token.length-1]);
		
		int x = 2;
		int y = 5;
		
	}
}







