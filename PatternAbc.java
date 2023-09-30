package com.Patterns;

public class PatternAbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		char k='A';
		for(int r=1;r<=row;r++)
		{
			k='A';
			for(int c=1;c<=r;c++)
			{
				
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
