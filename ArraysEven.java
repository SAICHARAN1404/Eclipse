package com.Arrays;

import java.util.Scanner;

public class ArraysEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array values");
		int[] a=new int[4];
		int [] b=new int[a.length];
		int x;
		for( x=0;x<=a.length-1;x++)
		{
			a[x]=sc.nextInt();
		}
		for (x=0;x<=b.length-1;x++)
		{
			b[x]=a[x];
		}
		for( x=b.length-1;x>=0;x--)
		{
			if(a[x]%2==0)
			System.out.println(b[x]);
		}
	}
}
