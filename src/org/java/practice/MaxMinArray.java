package org.java.practice;

public class MaxMinArray {

	public static void main(String [] args) {

		int [] a = {5,1,6,4,2,3};

		int max = a[0];
		int min = a[0];
		System.out.println("The elements of array are :");

      for(int k:a) {
    	  System.out.print(k);
    	  System.out.print(" ");
      }
    
      System.out.println();
		for(int i=1;i<a.length;i++) {

			if(a[i]>max) {

				max = a[i];	

			}

		}
		System.out.println("The max value is " +max);

		for(int i=1;i<a.length;i++) {

			if(a[i]<min) {

				min = a[i];	

			}

		}
		System.out.println("The min value is " +min);
	}
}