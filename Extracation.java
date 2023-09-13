package com.Forloop;

public class Extracation {

	public static void main(String[] args) 
	{
		int num=76546716,count=0,rem,mul=1,sum=0;
		for(;num!=0;num/=10)
		{
			count++;
			rem=num%10;
			if(count==1 || count==8)
				mul=rem*mul;
			else
				sum=sum+rem;
		}
		System.out.println("mul ="+mul);
		System.out.println("sum ="+sum);
		System.out.println("mul + sum =" +(mul+sum));
	}

}
