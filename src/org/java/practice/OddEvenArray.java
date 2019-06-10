package org.java.practice;

import java.util.ArrayList;

public class OddEvenArray {
	
	public static void main(String [] args) {

		int [] a = {5,1,6,4,2,3};
		
		ArrayList<Integer> odd = new ArrayList();
		ArrayList<Integer> even = new ArrayList();
		
		int odd_count =0;
		int even_count =0;
        int sum_even =0;
        int sum_odd =0;
        
		// Count odd and even no. of elements
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				even_count+=1;
			}
			
			else {
				odd_count+=1;
				
			}
		}
		
		System.out.println("The number of odd elements are " +odd_count);
		System.out.println("The number of even elements are " +even_count);
		
		// Print odd and even  elements
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				even.add(a[i]);
			}
			
			else {
				odd.add(a[i]);
				
			}
		}
		System.out.println("The odd elements are " +odd);
		System.out.println("The even elements are " +even);  
		
		//Sum of odd/even elements
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				sum_even+=a[i];
			}
			
			else {
				sum_odd+=a[i];
				
			}
		}
		
		
		
		System.out.println("The sum of odd elements are " +sum_odd);
		System.out.println("The sum of even elements are " +sum_even); 
}
}
