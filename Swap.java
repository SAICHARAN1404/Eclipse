package com.Quotioneer;

public class Swap {

	public static void main(String[] args)
	{
		int a[]=new int[] {9,4,9,0,2,0};
		int x;
		for (x=0;x<a.length;x+=2)
		{
			int temp=a[x];
			a[x]=a[x+1];
			a[x+1]=temp;
		}
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
			
	}
}