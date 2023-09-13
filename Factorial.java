package com.codinghub;

public class Factorial 
{

	public static void main(String[] args)
	{
		int x=23,y=x/10,z=x%10,a=y+z,temp=1,start=1;
		System.out.println("y= "+y+" z= "+z);//y=23/10=2//z=23%10=3//
		System.err.println("a= "+a);//a=y+z=2+3=5//
		while(a>=start)//5>start=1//
		{
			temp=start*temp;//temp=1*1=1//temp=2*temp(1)=2//temp=3*temp(2)=6//temp=4*temp(6)=24//temp=5*temp(24)=120//              
			System.out.println("temp= "+temp);//1//2//6//24//120//
			start++;//1+1=2//2+1=3//3+1=4//4+1=5//
			//in the above temp ,every time the temp value is getting changed because
			//the updated value is stored in temp//
		}

	}

}
