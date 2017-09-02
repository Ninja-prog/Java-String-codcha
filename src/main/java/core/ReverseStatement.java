// Write a program which will print the given statement in reverse: John Smith -> Smith John
package core;
import java.util.Scanner;

public class ReverseStatement {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a statement: ");
		String statement = input.nextLine(); input.close();
		String[] array = statement.split(" ");
		String reverse = "";
		for(int i = array.length - 1; i >= 0; i--) {
			reverse +=array[i]; reverse += " ";}
		System.out.println("Statement \"" + statement + "\" in reverse: " + reverse);
	}
}
