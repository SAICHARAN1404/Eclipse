package com.Patterns;

public class PatternsEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4,count=2;
		for(int x=1;x<=row;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(count+" ");
				count=count+2;
			}
			System.out.println();
		}
	}

}
