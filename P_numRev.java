package com.Patterns;

public class P_numRev {

	public static void main(String[] args) {
		// Underscores in triangle ,numbers in revere right angle
		int row=7,x,y,z;
		for(x=row;x>=1;x--)
		{
			for(y=x;y<=row;y++)
			{
				System.out.print("_ ");
			}
			for(z=1;z<=x;z++)
			{
				System.out.print(z+"  ");
			}
			System.out.println();
		}
	}

}
