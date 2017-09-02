// Problem: Write a program which will toggle between uppercase and lowercase of a given string.
package core;
import java.util.Scanner;

public class ToggleCase {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String string = input.nextLine(); input.close();
		String switch_case = "";
		
		for (int i = 0; i < string.length(); i++) {
			char letter = string.charAt(i); // .charAt translates the letter and translates the number into ASCII
			if(65 <= letter && letter <= 90) {letter = (char) (letter + 32);} // ALL Uppercase letters start from 65 in ASCII and ends after 90
			else if (97 <= letter && letter <+ 122) {letter = (char) (letter - 32);} // If summ (+32)  will be Uppercase, if subtract (-32) will be Lowercase
			switch_case += letter;
		}
			System.out.println("String \"" + string + "\" with switched case: " + switch_case);
		}
	}
