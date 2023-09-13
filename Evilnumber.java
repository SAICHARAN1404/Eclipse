package com.Forloop;

public class Evilnumber {

	public static void main(String[] args)
	{
		int j,square,rem,sum=0;
		for(j=1;j<=30000;j++)
		{
			sum=0;
			square=(int)Math.pow(j,2);
			for(;square!=0;square/=10)
			{
				rem=square%10;
				sum=sum+rem;
			}
			if(sum==j)
				System.out.println(sum);
		}
	}

}
