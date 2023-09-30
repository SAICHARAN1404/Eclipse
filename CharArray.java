package com.Quotioneer;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		char a[]=new char[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array values");
		
		int x;
		for(x=0;x<a.length;x++)
		{
			a[x]=sc.next().charAt(a[x]);
			
		}
		System.out.println(a);
		
	}

}
