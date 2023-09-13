package com.codinghub;

public class Lastdigitprime
{

	public static void main(String[] args) 
	{
		int a=123,x=a%10,temp=0,start=1;//x=123%10=3//
		System.out.println(x);//x=3
		while(x>=start)//3>=1//3>=2//3>=3//
		{
			if (x%start==0)//3%1==0==>true//3%2!=0-->False//3%3==0-->true//
			{
				temp++;//1//2//
			}
			start++;//1//2//3/
		}
		if (temp==2)//temp=2
			System.out.println(x+" prime");//3 prime
		else
			System.out.println(x+" not prime");
			

	}

}
