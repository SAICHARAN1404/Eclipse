package com.Executiontest;

public class Technumberrange {

	public static void main(String[] args)
	{
		for(int num=1;num<=10000;num++)
		{
			int rem1,rem2,sum=0,squ,count=0;
			int temp=num;
			for(;temp>0;temp/=10)
			{
				count++;
			}
			temp=num;
			count=count/2;
			rem1=temp/(int)Math.pow(10,count);
			rem2=temp%(int)Math.pow(10,count);
			sum=rem1+rem2;
			squ=sum*sum;
			if(squ==num)
				System.out.println(num);
		}
	}

}
