package org.java.practice;

import java.util.Scanner;

class Fib{
	int f=1;
	public int callFact(int n) {
		if(n>0) {
		f = f*n;
		callFact(n-1);
		
	}
		return f;
}
}	



public class FactorialRecursion {
	
	public static void main(String args[]) {
		
		System.out.println("Enter number whose factorial you want :");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Fib f = new Fib();
		int res = f.callFact(n);
		System.out.println("The factorial of " +n + " is " +res);
		
	}

}

