package org.java.practice;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String args[]) {

		int n,i;
		System.out.println("Enter the number whose multiplication table is needed: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (i=1;i<=12;i++) {
			System.out.println(n+"*"+i+ " = "+n*i);
		}

}
}