package org.java.practice;

import java.util.Scanner;

class Fib2{
	
	public void Fibonacci(int a,int b,int n) {
		if(n>2) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		Fibonacci(a,b,n-1);
		}
	}
	
}

public class FibonacciRecursion {
	
	public static void main(String args []) {
		
		System.out.println("How many numbers of Fibonacci series you want : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		Fib2 f = new Fib2();
		f.Fibonacci(a,b,n);
	}

}
