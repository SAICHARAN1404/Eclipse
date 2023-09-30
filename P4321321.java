package com.Patterns;

public class P4321321 {

	public static void main(String[] args) {
		int row=5;
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
