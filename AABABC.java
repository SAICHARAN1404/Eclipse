package com.Forloop;

public class AABABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4;
		char k='a';
		for (int r=1;r<=rows;r++)
		{
			k='a';
			for(int c=1;c<=r;c++)
			{
				System.out.print(k+",");
				k++;
			}
			System.out.println();
		}
	}

}
