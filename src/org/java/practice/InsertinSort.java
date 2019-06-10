package org.java.practice;

public class InsertinSort {

	public static void main(String [] args) {

		int [] arr = {5,1,6,4,2,3};

		for (int i=0;i<arr.length-1;i++) {
			for(int j=0;j<=i;j++) {
				
				if (arr[i+1]<arr[j]) {
					arr[j]= arr[i+1];
					arr[j+1] = arr[j];
					break;
				}
			}
			
			
			

		}
		
		for(int k:arr) {
			System.out.print(k);
			System.out.print(" ");
		}

	}
}
