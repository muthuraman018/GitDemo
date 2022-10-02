package javaProgram;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
int originalnum= scanner.nextInt();
scanner.close();
int num = originalnum;
int rev =0;
int rem;
while(num!=0) {
	rem=num%10;
	rev = (rev*10)+rem;
	num= num/10;
}
if(originalnum==rev) {
	System.out.println("The number is palindrome");
}else {
	System.out.println("The number is not  palindrome");
}

	}

}
