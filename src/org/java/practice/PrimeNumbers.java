package org.java.practice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String args[]) {
		int i,j;
		System.out.println("The prime numbers between 1 and 100 are " );

		for(i=2;i<=100;i++) {

			for(j=2;j<i;j++) {

				if(i%j == 0)
					break;
			}

			if (i == j) {
				System.out.println(i);

			}


		}	
	}
}
