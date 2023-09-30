package com.Arrays;

public class Search {

	public static void main(String[] args) {
	int a[]=new int [] {1,123,12,31,13,13,33,2,13,124};
	int search=13;
	New n =new New();
	n.findElement(a,search);
	}
}
class New
{
	int count=0;
	public void findElement(int i[],int s)
	{
		int count=0;
		for(int x:i)
		{
			if(x==s)
			{
				count=1;
				System.out.println(s);
			}
		}
		if(count==0)
			System.out.println("not found");
		
	}
}
