package controlFlow;

public class Method {

	public static void main(String[] args) {
//		System.out.println("In the main");
//		String content = "some text";
//		printMethod(content);
		int result = power(2, 3);
		System.out.println(result);
	}

	public static void printMethod(String input){
		System.out.println("Inside print method");
		System.out.println(input);
	}
	
	public static int power(int a, int b){
		int result = a;
		for(int i=1; i < b; i ++){
			result = a * result;
		}
		return result;
	}
}
