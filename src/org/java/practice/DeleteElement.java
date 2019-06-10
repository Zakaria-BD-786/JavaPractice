package org.java.practice;

import java.util.Scanner;

public class DeleteElement {

	public static void main(String [] args) {
		
		int [] a = {5,1,6,4,2,3};
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter element to be deleted :");
		int n = scan.nextInt();
		
		
		for(i=0;i<a.length;i++) {
			
			if(a[i] == n) {
				for(int j=i;j<a.length-1;j++) {
					a[j] = a[j+1];
				}
				break;
			}
			
			
		}
		
		if(i==a.length) {
			System.out.println("Element " +n +" is not present in the array");
		}
		
		for(int j:a) {
			  
			  System.out.print(j);
			  System.out.print(" ");
		  }
		
	}
	
}
