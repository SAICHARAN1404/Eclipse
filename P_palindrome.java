package com.Patterns;

public class P_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4,rem,num,rev=0;
		for(int x=1;x<=row;x++)
		{
			rev=0;
			for(num=x;num>0;)
			{
				rem=num%10;
				rev=rev*10+rem;
			}
			if(rev==num)
			{
				num/=10;
				System.out.print(num);
			}
				
		}
	}

}
