package com.Forloop;

public class Armstrong {

	public static void main(String[] args) 
	{
		double num=153,rem,digits=0,sum=0;
		double i=num;
	    for(;num!=0;num/=10)
	    {
	    	digits++;
	    }
	    for(;num!=0;num/=10)
	    {
	    	rem=i%10;
	    	sum=sum+(Math.pow(rem, digits));
	    }
	    System.out.println(sum);
	    System.out.println(digits);
	   
	}
}
