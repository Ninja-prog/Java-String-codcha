// Write a program which will find the longest string. what is your father name -> "father"
package core;
import java.util.Scanner;

public class LongestString {
	public static String longest(String strings) {
		int maxLength = 0;
		String [] array = strings.split("\\s"); // "\\s" white space \s
		String longest = null;
		for(String string : array) {
		if (string.length() > maxLength) { //maxLenght = 0 for the first time
			maxLength = string.length();
			longest = string;}
		}
		return longest;
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entering multiple strings: ");
		String strings = input.nextLine(); input.close();
		System.out.println("the longest string is: " + longest(strings));
	}

}
