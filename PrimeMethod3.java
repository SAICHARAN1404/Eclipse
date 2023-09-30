package com.ClassesMethodsObjects;

public class PrimeMethod3 {

	public static void main(String[] args) 
	{ 
		Prime prime=new Prime();
		int result=prime.forLoop(17,0);//1
		System.out.println(result);
		prime.forLoop(result);//
	}
}
class Prime
{
	public int forLoop(int i,int factor)
	{
		int x;
		for(x=2;x<=i/2;x++)
		{
			if (i%x==0)
			{
				factor++;
				break;
			}
		}
		return factor;
	}
	public void forLoop(int factor)
		{
		System.out.println(factor);
		if(factor==0)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}
	
}