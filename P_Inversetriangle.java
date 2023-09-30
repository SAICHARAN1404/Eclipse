package com.Patterns;

public class P_Inversetriangle {

	public static void main(String[] args) {
		// printing reverse triangle 
		int row=4;
		for(int r=1;r<=row;r++)
		{
			for(int c=row;c>=r;c--)
			{	
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
