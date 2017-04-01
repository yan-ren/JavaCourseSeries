package controlFlow;

public class Method {

	public static void main(String[] args) {
		double celsius = 10.0;
		boolean cold = celsius > 10 ? false : true;
	}

	public static boolean cold(double celsius) {
		return celsius > 10 ? false : true;
	}

	public static double convertToFahrenheit(double celsius) {
		return celsius * 1.8 + 32.0;
	}

	public static void printString(String context) {
		for (int i = 0; i < context.length(); i++) {
			System.out.println(context.charAt(i));
		}
	}

	public static void addString(String context) {
		System.out.println("Original input: " + context);
		System.out.println("Text after: ");
		for (int i = 0; i < context.length(); i++) {
			System.out.print((char) (context.charAt(i) + 1));
		}
	}
}
