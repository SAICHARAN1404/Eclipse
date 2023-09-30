package com.Patterns;

public class PatternsPrime {

	public static void main(String[] args) {
		// Printing prime numbers in right angle triangle pattern//
		int rows=5,x,y,count=0,temp=1;
		for (x=1;x<=rows;x++)//x=9
		{
			for( y=1;y<=x;)
			{
				count=0;
				for(int i=1;i<=temp;i++)
				{
					if(temp%i==0)
						count++;
				}
				if(count==2)//prime
				{
					System.out.print(temp+" ");//
					y++;
				}
				temp++;
			}
			System.out.println();
		}
		
	}

}
