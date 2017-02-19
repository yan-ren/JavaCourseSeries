package controlFlow;

public class StringMethod {

	public static void main(String[] args) {
		String text = "abcdefghijklmn";
		System.out.println(text);
//		for(int i = 0; i<text.length(); i++){
//			System.out.print(text.charAt(i) + "%%%");			
//		}
//		for(int i = text.length()-1; i >= 0; i--){
//			System.out.print(text.charAt(i));
//		}
		char oneChar = text.charAt(1);
		
		
		text = text.substring(3, 6);
		System.out.println(text);
	}

}
