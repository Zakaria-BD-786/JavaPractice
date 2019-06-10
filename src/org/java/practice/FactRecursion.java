package org.java.practice;

import java.util.Scanner;

class Fact{
	
	int mul=1;
	public int callFact(int n){
		
		mul = mul*n;
		if(n!=1) {
		callFact(n-1);
		}
		
		return mul;
		
	}
	
	
}

public class FactRecursion {
	
	
	public static void main(String [] args) {
		Fact f = new Fact();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = scan.nextInt();
		
		int res = f.callFact(n);
		System.out.println(res);
		
	}

}
