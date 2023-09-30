package com.ClassesMethodsObjects;

public class Parameterizedmodel {

	public static void main(String[] args) 
	{
		S a=new S();
		a.calAdd('A',14,14.4,"Charan");
	}
}
class S
{
	public int  calAdd(char i,int j, double k,String l)
	{
		
		System.out.println(i+" "+j+" "+k+" "+l);
		return j;
	}
}
