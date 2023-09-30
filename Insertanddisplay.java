package com.Quotioneer;

import java.util.Scanner;

public class Insertanddisplay {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array values");
		
		
		for(int  x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
	}

}