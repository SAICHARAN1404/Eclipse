package com.Forloop;

public class Palindrome {

	public static void main(String[] args) 
	{
	       int num=92829,rem,reverse=0;
	       int i=num;
	       for(;num!=0;num/=10)
	       {
	             rem=num%10;
	             reverse=reverse*10+rem;      
	       }
	       System.out.println("given Number ="+i);
	       System.out.println("Reversed Number ="+reverse);
	        
	        
	       if(reverse==i)
	    	   System.out.println("Given number is a palindrome");
	        
	        
	       else
	    	   System.out.println("Given number is not a palindrome");
	}
}
