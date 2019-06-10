package org.java.practice;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String args[]) {

		int n,i;
		int rem;
		int rev = 0;
		System.out.println("Enter the number to reverse: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		while(n!=0) {
			rem = n%10;
			n= n/10;
			rev = rev * 10+rem;			
		}
		System.out.println("The reversed number is " +rev);


}
}
