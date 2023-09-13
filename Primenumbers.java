package com.codinghub;

public class Primenumbers
{
	public static void main(String[] args)
	{
		int x=46,y=x/10,z=x%10,a=y+z,temp=1;//y=4//z=6//a=4+6=10/
		System.out.println("y= "+y+" z= "+z);//y=4//z=6//
		System.err.println("a= "+a);//a=10
		while(a>=1)//10,9,8,7,6,5,4,3,2,1>=1,
		{
			temp=a*temp;//10*1=10//9*10=90//................
			System.out.println("temp= "+temp);
			a--;//10//9//8//7//6//5//4//3//2//1//
		}
		
	}

}