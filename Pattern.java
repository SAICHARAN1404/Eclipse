package com.Executiontest;

public class Pattern {

	public static void main(String[] args)
	{
		int row=4;
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
