// Write a program which will check the given string is palindrome or not: abba -> palindrome
package core;
import java.util.Scanner;  
  
public class PalindromeString {  
	
	public static void main(String args[]) {  
           Scanner in = new Scanner(System.in);
           System.out.print("Enter the string: ");
           String string = in.nextLine(); in.close();
           
            char[] chars = string.toCharArray();
            String reverse = "";
            
            for(int i = chars.length -1; i >= 0; i--) {reverse += chars[i];}
            System.out.println("String \"" + string + "\" is " + (string.equals(reverse) ? "palindrome" : "not a palindrome"));  
        }  
}  