package com.Quotioneer;
public class ElementsOper 
{
	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,22};
		int b[]=new int[(a.length)/2];
		int c[]=new int [(a.length)/2];
		int x,y;
		System.out.println("All array elments");
		for(x=0;x<=(a.length-1);x++)
		{
			System.out.println(a[x]);		
		}
		System.out.println("first half Array elements");
		for (x=0;x<=(a.length)/2;x++)
		{
			System.out.println(a[x]);
		}
		System.out.println("Second half Array elements");
		for( y=0,x=(a.length/2)+1;x<a.length;x++,y++)
		{
			System.out.println(a[x]);
		}
		System.out.println("Even indices ex:a[0],a[2]...");
		for( x=0;x<a.length;x+=2)
		{
			System.out.println(a[x]);
		}
		System.out.println("Odd indices ex:a[0],a[2]...");
		for( x=0;x<a.length;x++)
		{
			if(x%2!=0)
			System.out.println(a[x]);
		}
		
		System.out.println("Even  Array Elements");
		for(x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
				System.out.println(a[x]);	
		}
		System.out.println("Odd Array Elements");
		for(x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
				System.out.println(a[x]);
		}
		System.out.println("Elements divisible by 4");
		for(x=0;x<a.length;x++)
		{
			
		}
	}
}
