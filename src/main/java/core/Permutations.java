// Definition: Permutation - the action of changing the arrangement of a characters
// Problem: Write a program which will print all permutations of a string
package core;
import java.util.Scanner;
public class Permutations {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine(); input.close();
		System.out.print("Permutations of string \"" + string + "\" are: ");
		char [] ch = string.toCharArray();
		
		int number = ch.length;
		int [] array = new int[number];
		int item = 0;
		for (int i=0; i< Math.pow(number, number); i++) {
			item = 0;
			while (item < number) {System.out.print(ch[array[item]] + ""); item++;}
			System.out.print(", ");
			item = 0;
			while (item < number) {
				if (array[item] < number -1) {array[item]++; break;}
				else {array[item] = 0; item++;}}
	}
}
}