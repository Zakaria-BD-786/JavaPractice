package org.java.practice;

import java.util.Scanner;

public class InsertElement {

	public static void main(String [] args) {
		
		int [] a = {5,1,6,4,2,3};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter position where you want to insert :");
		int n = scan.nextInt();
		System.out.println("Enter element to be inserted :");
		int N = scan.nextInt();
		
		for(int i=a.length-1;i>=n;i--) {
			
			a[i]=a[i-1];
			
		}
		
		  a[n-1] = N;
		  System.out.println("The new array is :");
		  for(int j:a) {
			  
			  System.out.print(j);
			  System.out.print(" ");
		  }
		
		
	}
}
