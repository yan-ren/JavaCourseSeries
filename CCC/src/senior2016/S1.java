package senior2016;

import java.util.Arrays;

public class S1 {
	
	public static void main(String args[]){
		String a = "aab";
		String b = "*aa";
		if(a.length() != b.length()){
			System.out.println("NOT ANAGRAMS");
			System.exit(0);
		}
		String result = (compare(calculateCharacters(a), calculateCharacters(b)) == true) ? "ANAGRAMS": "NOT ANAGRAMS";
		System.out.println(result);
	}

	public static boolean compare(int[] a, int[] b){
		for(int i = 0; i<a.length ; i++){
			if(a[i] < b[i]){
				return false;
			}
		}
		return true;
	}
	
	//help method. input a string, 
	//output an array that each element represents the frequency of characters
	public static int[] calculateCharacters(String input){
		int[] result = new int[26];
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == '*'){
				continue;
			}
			int position = input.charAt(i) - 'a';
			result [position] = result[position] + 1;
		}
		return result;
	}
}
