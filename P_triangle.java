package com.Patterns;

public class P_triangle {

	public static void main(String[] args) {
		// PRINTING TRIANGLE 
		int row=4;
		for(int r=1;r<=row;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
