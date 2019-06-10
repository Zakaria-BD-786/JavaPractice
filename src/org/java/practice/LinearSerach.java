package org.java.practice;

import java.util.Scanner;

public class LinearSerach {
	
	public static void main(String args []) {
	int [] a = {5,1,6,4,2,3};
	int i;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter element which you want to search :");
	int item = scan.nextInt();
	
	for(i=0;i<a.length;i++) {
		if (a[i] == item) {
			
			System.out.println("Element is found at " +i +" position");
			break;
		}
	}
	if(i==a.length) {
		System.out.println("Element " +item +" is not present in the array");
	}
	
	
}
}
