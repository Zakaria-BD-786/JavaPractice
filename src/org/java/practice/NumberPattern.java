package org.java.practice;

public class NumberPattern {



	public static void main(String args []) {
		int count =0;

		for (int i=1;i<=4;i++) {

			for(int j= 1;j<=i;j++) {
				System.out.print(j);

			}
			System.out.print("\n");

		}

		for (int i=1;i<=4;i++) {

			for(int j= 1;j<=i;j++) {
				System.out.print(i);

			}
			System.out.print("\n");

		}

		for (int i=1;i<=4;i++) {

			for(int j= 1;j<=i;j++) {

				count = count+1;
				System.out.print(count);

			}
			System.out.print("\n");

		}

		for (int i=1;i<=4;i++) {

			for(int j= i;j>=1;j--) {


				System.out.print(j);

			}
			System.out.print("\n");

		}
		for (int i=1;i<=4;i++) {

			for(int j= 1;j<=i;j++) {

				System.out.print(j);

			}
			for(int k= i-1;k>=1;k--) {
				
				System.out.print(k);
				
			}
			System.out.println();
		}

		for (int i =1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 6;i>=1;i--) {
			
			for(int j=i-1;j>=1;j--) {
				
				System.out.print(j);
			}
			System.out.print("\n");
			for (int k=0;k<=6-i;k++) {
				System.out.print(" ");
			}
		
			
		}
		
		 


	}



}
