package javaProgram;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		String s =scanner.nextLine();
		scanner.close();
		 
		char[] c = s.toCharArray();
		int length = c.length;
		 String reverseString ="";
		 for(int i=length-1;i>=0;i--) {
			 reverseString= reverseString+c[i];
		 }
		 if(s.equals(reverseString)) {
			 System.out.println("the string is palindrome");
		 }else {
			 System.out.println("the number is not palindrome");
		 }

	}

}
