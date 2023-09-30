package com.Patterns;

public class Diamond{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4,x,y,z;
		for(x=1;x<=row;x++)
		{
			for(y=row;y>=x;y--)
			{
				System.out.print("_ ");
			}

			for(z=1;z<=x;z++)//z=1<=4//2
			{
				System.out.print(z+" ");//1//
			}
			System.out.println();
		}
		for(int j=1;j<=row;j++)
		{
			for(int k=1;k<=j;k++)
			{
				System.out.print("_ ");
			}
			for (int l=row;l>=j;l--)
			{
				System.out.print(l+" ");
			}
			
			System.out.println();
		}
	}
}

