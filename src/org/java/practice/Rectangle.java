package org.java.practice;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String args[]) {
		
		int l,b,area;
		System.out.println("Enter length: ");
		Scanner length = new Scanner(System.in);
		System.out.println("Enter breadth: ");
		Scanner breadth = new Scanner(System.in);
		l = length.nextInt();
		b = length.nextInt();
		area = l*b;
		System.out.println("The area is " + area +" units");
		
		
	}

}
