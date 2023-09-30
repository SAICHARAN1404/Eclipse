package com.ClassesMethodsObjects;

public class ArmstrongClass {

	public static void main(String[] args)
	{
		Arm a=new Arm();
		int result=a.findDigits();a.calAdd(result); a.isComp();
	}
}
class Arm
 
{
	int num=153,rem,digits=0,sum=0;
	public int findDigits()
	{
		for(int j=num;j>0;j/=10)
	    {
	    	digits++;
	    }
		return digits;
	}
	public int calAdd(int digits)
	{
		for(int i=num;i>0;i/=10)
	    {
	    	rem=i%10;
	    	sum=sum+(int)(Math.pow(rem, digits)); 
	    }
		return sum;
	}
	public void isComp()
	{
		System.out.println(sum+" "+num);
		if(sum==num)
	    	System.out.println("Armstrong");
	    else
	    	System.out.println("not");
	}
}