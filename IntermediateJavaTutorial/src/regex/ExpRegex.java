package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpRegex {
	public static void main(String[] args) {
		// String text =
		// "This is the text which is to be searched " +
		// "for occurrences of the woird 'is'. wai";
		//
		// String regex = "w.i";
		//
		// Pattern pattern = Pattern.compile(regex);
		// Matcher matcher = pattern.matcher(text);
		//
		// int count = 0;
		// while(matcher.find()) {
		// count++;
		// System.out.println(text.subSequence(matcher.start(), matcher.end()));
		// System.out.println("found: " + count + " : " + matcher.start() + " -
		// " + matcher.end());
		// }

		String text = "John writes about this, and John Doe writes about that,"
				+ " and John Wayne writes about everything.";

		String patternString1 = "(John) (.+?) ";

		Pattern pattern = Pattern.compile(patternString1);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group(0));
			System.out.println("found: " + matcher.group(1) + " " + matcher.group(2));
		}

	}
}
