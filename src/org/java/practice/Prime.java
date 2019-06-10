package org.java.practice;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {

		int n,i;
		System.out.println("Enter number to check: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(i=2;i<=n/2;i++) {
			
			if(n%i == 0)
			break;
		}
		
		if (i == n/2+1) {
			System.out.println(n +" is a prime number");
			
		}
		else {
			System.out.println(n +" is not a prime number");
						
		}
		
		
}
}