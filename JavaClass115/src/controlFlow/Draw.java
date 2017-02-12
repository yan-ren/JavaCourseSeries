package controlFlow;

public class Draw {

	public static void main(String[] args) {
		// for(int i =0; i < 10; i++){
		// afor(int j = 0; j< 10; j++){
		// if(i == j || i + j == 9)
		// System.out.print("#");
		// else
		// System.out.print(" ");
		// }
		// System.out.println("");
		// }

		int a = 100;
		int b = 30;
		int c = 90;

		if (b > a) {
			if (c > b) {
				System.out.println("c is the biggest number");
			} else {
				System.out.println("b is the biggest number");
			}
		} else {
			if (c > a) {
				System.out.println("c is the biggest number");
			} else {
				System.out.println("a is the biggest number");
			}
		}

	}
}
