package unit3;

public class StringMethod {

	public static void main(String[] args) {
		String text = "hello world";
//		System.out.println("the length of my string is: " + text.length());
//		
//		System.out.println("the index of 6 is character: " + text.charAt(6));
//		
//		for(int i = text.length() - 1; i >= 0; i--){
//			System.out.print(text.charAt(i));
//		}
//		System.out.println();
		
		//loop through the text string and print out non 'l' character
		for(int i = 0; i < text.length(); i++){			
			if(text.charAt(i) != 'l'){
				System.out.print(text.charAt(i));
			}			
		}
		System.out.println("\n"+text.length());
				
	}
}
