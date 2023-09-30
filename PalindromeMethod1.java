package com.ClassesMethodsObjects;

public class PalindromeMethod1 {

	public static void main(String[] args) 
	{
		
		Pal p=new Pal();
		p.x=121;
		p.extractNum();
		p.compNum();
	}

}
class Pal
{
	int x,temp=x,rem,rev;
	public void extractNum()
	{
		temp=x;
		for(int rem;x>0;x/=10)
		{
			rem=x%10;
			rev=rev*10+rem;
		}
	}
	public void compNum()
	{
		
		System.out.println(rev+" "+temp);
		if(rev==temp)
			System.out.println("Palindrome");
		else 
			System.out.println("Not a Palindrome");
		
	}
}