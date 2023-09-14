package com.Forloop;
public class OneTwo
{
	public static void main(String[] args) 
	{
	   int num=54321,rem;
	   for (int i=num;i!=0;i/=10)
	   {
	       rem=i%10;
	       if(rem==1)
	            System.out.println("ONE");
	       else if(rem==2)
	            System.out.println("TWO");
           else if(rem==3)
	            System.out.println("THREE");
	       else  if(rem==4)
	            System.out.println("FOUR");
	       else if(rem==5)
	            System.out.println("FIVE");
	       else if(rem==6)
	            System.out.println("SIX");
	       else if(rem==7)
	            System.out.println("SEVEN");
	       else if(rem==8)
	            System.out.println("EIGHT");
	       else if(rem==9)
	            System.out.println("NINE");
	       else if(rem==0)
	            System.out.println("ZERO");
	   }     
	}
}
