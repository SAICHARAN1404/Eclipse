package com.Package1;



public class Prime {

	public static void main(String[] args)
	{
		Pr prime=new Pr();
		prime.p=7;
		prime.forLoop();prime.primePrint();
	}
}
class Pr
{
	
	int p,count=0;
	void forLoop()
	{
		for(int start=2;start<=p/2;start++)
		{
			if(p%start==0)
			{
				count++;
				break;
			}
			
		}
	}
	void primePrint()
	{
		if(count==0)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}

}


