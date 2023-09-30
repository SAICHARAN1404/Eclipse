package com.Patterns;

public class P_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=7,x,y,z;
		for(x=1;x<=row;x++)
		{
			for( y=row-1;y>=x;y--)
			{
				System.out.print(" ");
			}
			for( z=1;z<=x;z++)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		for(x=1;x<=row;x++)
		{
			for(y=1;y<=x;y++)
			{
				System.out.print(" ");
			}
			for(z=row;z>=x;z--)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
	}

}
