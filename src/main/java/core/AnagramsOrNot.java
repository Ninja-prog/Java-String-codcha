// Definition: 2 strings are called anagrams if they contain same set of characters but in different order.
// Problem: Write a program which will check given phrases are anagrams or not.
package core;
import java.util.Scanner;

public class AnagramsOrNot {
	
	public static boolean anagrams(String first, String second) {
		if(first.replaceAll("\\s", "").length() != second.replaceAll("\\s", "").length()) // Error Handling
		{return false;} // Error Handling {return false} - sign that is Error Handling
		int value = 0;
		for(int i = 0; i < first.replaceAll("\\s", "").length(); i++) {
			value += Math.pow(first.replaceAll("\\s", "").toLowerCase().charAt(i), 2); // Math.pow enforces in ASCII, so that there are no repetitions
			value -= Math.pow(second.replaceAll("\\s", "").toLowerCase().charAt(i), 2);}
			return value == 0;
		}
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the first phrase: ");
			String first = input.nextLine();
			System.out.print("Enter the second phrase: ");
			String second = input.nextLine(); input.close();
			System.out.println("Phrases \"" + first + " & " + second +
								"\" are " + (anagrams(first, second) ? "anagrams" : "not anagram"));
			
		}
	}
