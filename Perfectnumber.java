package com.Forloop;

public class Perfectnumber 
{

	public static void main(String[] args) 
	{
		int x=6,sum=0;//3
		int temp=0;
		for(int i=1;i<x;i++,temp++)//2<3
		{
			if(x%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
			
		}
		System.out.println(temp);
		if(sum==x)
		{
			System.out.println(sum+" perfect number");
		}
		else
		{
			System.out.println(sum+" not a perfect number");
		}
	}

}
