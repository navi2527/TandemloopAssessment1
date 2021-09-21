//Java programming language 

package com.tandemloop.test1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		//addition
		System.out.println(String.valueOf(a+b));
		//subtraction
		System.out.println(String.valueOf(a-b));
		//multiplication
		System.out.println(Double.toString(a*b));
		//division
		System.out.println(Double.toString(a/b));	
	}
}

