package com.tandemloop.test1;

public class Program4 {

	public static void main(String[] args) {
	int dict[]= {1,2,3,4,5,6,7,8,9};
	int input1[]= {1,2,8,9,12,46,76,82,15,20,30};
	
	for(int i=0; i<dict.length; i++) {
		int count=0;
		for(int j=0; j<input1.length; j++) {
			if(input1[j]%dict[i]==0) {
				count++;
			}
		}
		System.out.print(i+" " +"=" +" "+count +" ");
	}
	}
	

}