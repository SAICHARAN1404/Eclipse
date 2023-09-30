package com.Patterns;

public class P_tri_rev {

	public static void main(String[] args) {
		//
		int row=7,i,j,k;
		for(i=1;i<=row;i++)
		{
			for(j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(i=row-1;i>=1;i--)
		{
			for(j=i;j<=row;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
