package com.Patterns;

public class P121321 {
	public static void main(String[] args) {
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
		for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
				
			}
			System.out.println();
		}
	}
}
