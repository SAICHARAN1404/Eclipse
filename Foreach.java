package com.Arrays;

public class Foreach {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		Foreach For=new Foreach();
		System.out.println(For);
		For.showArray(a);
	}
	public void showArray(int i[])
	{
		int count=0;
		for(int temp:i)
		{
			count++;
			System.out.println(temp);
		}
		System.out.println(count+" =count");
	}
}
