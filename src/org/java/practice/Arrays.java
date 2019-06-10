package org.java.practice;

import java.util.Scanner;

public class Arrays {

	public static void main(String [] args) {
		
		// One dimensional array
		/* int arr [] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 5 numbers : ");
		for(int i=0;i<5;i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i =0;i<5;i++) {
			System.out.println("arr["+i+"] =" +arr[i] );
		}
		
		// Two dimensional array
		int[][] arr_two = new int[3][2];
		System.out.print("Enter 2 numbers for array 1 : ");
		for(int i=0;i<2;i++) {
			arr_two[0][i] = scan.nextInt();
		}
		System.out.print("Enter 2 numbers for array 2 : ");
		for(int i=0;i<2;i++) {
			arr_two[1][i] = scan.nextInt();
		}
		System.out.print("Enter 2 numbers for array 3 : ");
		for(int i=0;i<2;i++) {
			arr_two[2][i] = scan.nextInt();
		}
		// Printing elements of the 2D array
		for (int i =0;i<3;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr_two[i][j]);
			}
		System.out.print("\n");
		}  */
		
		// Three dimensional array
		
		int [][][] a = {{{1,2,2},{3,4,4},{5,6,7,7}},{{8,9,10,11},{12,13,14,15},{16,17,18,19}}};
		
		for (int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				for(int k =0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	
}
