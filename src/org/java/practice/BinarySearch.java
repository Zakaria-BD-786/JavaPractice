package org.java.practice;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String args []) {
		int [] a = {1,2,4,6,8,9};
		int li,hi,mi;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter element which you want to search :");
		int item = scan.nextInt();
	    
		li = 0;
		hi = a.length-1;
		mi = (li+hi)/2;
		
		while(li<=hi) {
		if(item == a[mi]) {
			System.out.println("The element is found at " +mi +" position");
			break;
		}
		else if(item>a[mi]){
			li= mi+1;
		}
		else if(item<a[mi]) {
			hi= mi-1;
		}
		mi = (li+hi)/2;
		}
		
		if(li>hi) {
			System.out.println("Element " +item +" is not present in the array");
		}
		
	}
	

}
