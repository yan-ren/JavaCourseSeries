package subString;

public class SubString {

	public static void main(String[] args) {
		String aString = "abcdefghijk";
		int k = 3;
		int min = calAlphabeticNum(aString.substring(0, k));
		String minString = aString.substring(0, k);
		int max = calAlphabeticNum(aString.substring(0, k));
		String maxString = aString.substring(0, k);

		for (int i = 0; i < aString.length() - k + 1; i++) {
			int tmp = calAlphabeticNum(aString.substring(i, i + k));
			if (tmp > max) {
				max = tmp;
				maxString = aString.substring(i, i + k);
			}
			if (tmp < min) {
				min = tmp;
				minString = aString.substring(i, i + k);
			}
		}
		System.out.println("max String is " + maxString + "; min String is " + minString);
	}

	public static int calAlphabeticNum(String a) {
		int value = 0;
		for (int i = 0; i < a.length(); i++) {
			value += a.charAt(i);
		}
		return value;
	}
}
