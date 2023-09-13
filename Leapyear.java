package com.codinghub;

public class Leapyear 
{
	public static void main(String[] args)
	{
		int year=2024,a=year%100,b=year/100;//a=2024%100=24//b=2024/100=20//
		if(year%4==0 && year%100!=0 || year%400==0)//2024%4==0--true && 2024%100!=0--true = both are true // 2024%400!=0//    
		{
			System.out.println(a);//a=24//
			if(a%2==0)//24%2==0
				System.out.println("even");//even
			else
				System.out.println("odd");//if a%2!=0-->odd
		}
		else//if not leap year//
			System.out.println(a+b);//20+24=44
	}
}
