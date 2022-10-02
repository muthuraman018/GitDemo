package javaProgram;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scaner.nextInt();
		scaner.close();
		int a=1;
		int b=1;
	int f=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
	while(f<number)
	{
		f=a+b;
		a=b;
		b=f;
		if(f>number)
			break;
		System.out.print(f+" ");
	}

	}

}
