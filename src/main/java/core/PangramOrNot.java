// Definition: A sentence or verse that contains all the letters of the alphabet(26).
//Problem: Write a program which will check the given sentence is pangram or not.
package core;
import java.util.Scanner;

public class PangramOrNot {
	public static boolean isPangram(String sentence) {
		sentence = sentence.toLowerCase();
		if (sentence.length() < 26) {return false;}
		for (char c = 'a'; c <= 'z'; c++) {
			if (sentence.indexOf(c) < 0) {return false;}}
		return true;}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String sentence = input.nextLine(); input.close();
		System.out.println("Sentence \"" + sentence + "\" is " +
		 (isPangram(sentence) ? "pangram" : "not pangram"));
	}

}
