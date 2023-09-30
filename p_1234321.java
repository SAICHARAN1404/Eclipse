package com.Patterns;

public class p_1234321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,col=4,x,y,z;
		for(x=1;x<=rows;x++)
		{
			for(y=1;y<=col;y++)
			{
				System.out.print(y);
			}
			for(z=y-2;z>=1;z--)
			{
				System.out.print(z);
			}
			System.out.println();
			
		}
	}

}
