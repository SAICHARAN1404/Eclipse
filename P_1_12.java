package com.Patterns;

public class P_1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
