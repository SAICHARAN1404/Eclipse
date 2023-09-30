package com.Patterns;

public class Patterns_palindrome {

	public static void main(String[] args) {
		int row=4,x,y,z,rem,rev=0;
		{
			for(x=1;x<=row;x++)
			{
				rev=0;
				for(y=1;y<=x;)
				{
					
					for(z=x;z>0;z/=10)
					{
						rem=z%10;
						rev=rev*10+rem;
					}
					if(rev==z)
						System.out.print(z);
				}
				System.out.println();
			}
		}

	}

}
