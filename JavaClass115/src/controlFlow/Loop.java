package controlFlow;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		/*
		 * for
		 * 
		 * while
		 * 
		 * for each
		 * 
		 */
		/* for */
		// int i = 0;
		// for( ; i < 5; i++){
		// System.out.println("hello");
		// System.out.println(i);
		// }

		// int a = 2;
		// int b = 4;
		// int result = 1;
		//
		// for(int i = 0; i<b; i++){
		// result = result*a;
		// }
		//
		// System.out.println(result);

		// int a = 2;
		// int b = 4;
		// double c = Math.pow(a, b);
		// System.out.println(c);

		// int i = 0;
		// while( (3 < i) && (i < 10) ){
		// System.out.println(i);
		// i++;
		// }

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n >= 2 && n <= 5) {
				ans = "Not weird";
			}
		}
		System.out.println(ans);
	}
}