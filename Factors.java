package com.codinghub;

public class Factors
{

	public static void main(String[] args) 
	{
		int x=23,y=x/10,z=x%10,a=y+z,end=1;
		while(a>=end)//y=2,z=3//a=2+3=5//5>=1//
		{
			if(a%end==0)//5%1==0//5%2,3,4!=0//5%5==0//
				System.out.println("factor "+end);//factor 1//factor 5//
			end++;//end=1+1=2,3,4,5//
		}

	}

}
