//Java programming language 

package com.tandemloop.test1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int res=1;
		System.out.print("input a = "  +a+" "+"then,output :" +res);
		int x=1;
		for(int i=1; i<a; i++) {
			res=x+2;
			System.out.print(" "+res+" ");
			x=res;
		}
	}

}
