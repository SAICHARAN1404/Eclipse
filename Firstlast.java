package com.codinghub;

public class Firstlast 
{

	public static void main(String[] args) 
	{
		int x=1234,y=x/1000,z=x%10,a=y+z,temp=1;
		System.out.println("y= "+y+" z= "+z);//y=1234/1000=1//z=1234%10=4//
		System.err.println("a= "+a);//a=1+4=5//
		while(a>=1)//5>=1//4>=1//3>=1//2>=1//1>=1//
		{
			temp=a*temp;//temp=5*1=5//temp=4*5=20//temp=3*20=60//temp=2*60=120//temp=1*120=120//
			System.out.println("temp= "+temp);//5//20//60//120//120
			a--;//4//3//2//1//
		}


	}

}
