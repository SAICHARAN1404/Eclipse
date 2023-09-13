package com.Forloop;

public class Evenorodd
{

	public static void main(String[] args) 
	{
		int i,j;
		for(i=1,j=50;i<=50;i++,j--)//j has no condition so decrement will start here//j =19///
		{
			if(i%2==0)//this condition is true for every 2 numbers//so j will decrement 2 numbers
				System.out.println(i+"  "+j);//19-2=17//17-2=15//........
		}
	}
}
