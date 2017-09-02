// Problem: Write a program which will print length of the given string without using length() method.
package core;
import java.util.Scanner;
// import java.util.regex.*;

public class LengthOfString {
		/*
		public static int length(String string) {				// #3 Best method
			Mathcer match = Pattern.compile("$").matcher(string);
			match.find();
			int length = match.end();
			return length; }
		 */
	
	public static int length(String string) {					// #1 Best method
		int count = 0;											
		try {while (true) {string.charAt(count); count++;}}		
		catch (IndexOutOfBoundsException e) {return count;} }	
	
		/*	
		public static int length3(String string) {				// #2 Best method using ReGex	
			String regex = "(?s)"; // dot match all chars,including line breaks in ReGex
			int length = 0;
			while (!string.mathces(regex)) {regex += "."; ++length;}
			return length; }
		 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine(); input.close();
		System.out.print("Length of string \"" + string + "\" is " + length(string));

		// System.out.println(string.toCharArray().length);
		// System.out.println(string.split("").length);
		// System.out.println(string.lastIndexOf("")); //.lastIndexOf method gives last letter or number (position)
	}
}

