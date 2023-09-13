package com.codinghub;

public class Extraction {

	public static void main(String[] args)
	{
		int num,rem;
		for(num=52542;num>0;num/=10)
		{
			rem=num%10;
			if(num%2!=0)
			
				System.out.println("ODD = "+rem);
			else 
				System.out.println("Even = "+rem);
		}
	}

}
