package com.Patterns;
public class Pattern1to10 {

	public static void main(String[] args) {
		int rows=4,count=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
