package com.Quotioneer;

public class Arrayinreverse {

	public static void main(String[] args) {
		int a[]=new int[] {12,56,34,23,67,76,32,75,90,345};
		int x;
		for( x=a.length-1;x>=0;x--)
		{
			System.out.println(a[x]);
		}
	}

}