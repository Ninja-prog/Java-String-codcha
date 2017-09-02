//Write a program which will print a string in reverse: abcdef -> fedcba
package core;
import java.util.Scanner;

public class ReverseStirng {
	public static void main(String args[]) {
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine(); input.close();
		char[] chars = string.toCharArray(); //Method of String
		String reverse = "";
		for (int i = chars.length -1; i >= 0; i--) {reverse += chars[i];} // R+=C -> same as R=R+C
		System.out.println("String \"" + string + "\" in reverse:" + reverse);
	}
}
