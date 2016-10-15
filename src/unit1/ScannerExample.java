package unit1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		String inputString = sc.next();
		inputString = "My name is " + inputString;
		System.out.println(inputString);
		
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		System.out.println(inputString+". I am "+age+" years old");
		
	}

}
