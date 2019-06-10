package org.java.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {

		int i,n;
		int f =1;
		System.out.println("Enter number whose factorial you want to calculate "
				+ ": ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if (n==0) {
			System.out.println("The factorial of " +n + " is 1");
		}
		else {
			for (i=n;i!=0;i--) {

				f=f*n;

			}
		 System.out.println("The factorial of " +n + " is " +f);	
		}

	}

}
