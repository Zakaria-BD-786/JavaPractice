package org.java.practice;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
	
public static void main(String args []) {
		
	    int rem;
	    int soc = 0;
	    int d=0;
		System.out.println("Enter no to check whether Armstrong or not : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int temp = n;
		while (temp!=0) {
			temp= temp/10;
			d++;
			
		}
		
		temp =n;
		while(temp!=0) {
			
			rem = temp%10;
			soc = (int) (soc + Math.pow(rem,d));
			temp= temp/10;
          
		}
		
		if (soc == n) {
			System.out.println(n + " is an Armstrong number");
			
		}
		else {
			System.out.println(n + " is not an Armstrong number");
		}
}
}
