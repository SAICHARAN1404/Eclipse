package com.Forloop;
public class Table 
{
	public static void main(String[] args)
	{	
		int a=9;
		for(int i=1;i<=10;i++)//i=1,2,3,4,5,6,7,8,9,10//
		{
			
			if(i%2==0)//2,4,6,8,10 %2==0
				System.out.println(a +" x "+i+" = "+a*i);
			//9 x 2 = 18
			//9 x 4 = 36
			//9 x 6 = 54
			//9 x 10 = 90
			
		}
	}
}
