package org.java.practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String [] args) {
		
		System.out.println("How many numbers of Fibonacci series you want : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a=0;
		int b=1;
		int c;
		System.out.println("The Fibonacci series of " +n +" numbers is : ");
		System.out.print(a);
		System.out.print("\t");
		System.out.print(b);
		System.out.print("\t");
		
		for (int i=1;i<=n-2;i++) {
			
			c = a+b;
			System.out.print(c);
			System.out.print("\t");
			a=b;
			b=c;
			
			
			
		}
		
		
	}
	
}
