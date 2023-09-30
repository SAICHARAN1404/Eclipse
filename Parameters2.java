package com.ClassesMethodsObjects;

public class Parameters2 {

	public static void main(String[] args) 
	{
		Para p=new Para();
		String s=" Sai Charan";
		char i='b';
	
		p.display( s, i);
		p.display(s);
	}

}
class Para
{
	
	public void display(String a,char b)
	{
		System.out.println(a+" "+b);
	}
	public void display(String p)
	{
		System.out.println(p);
	}
}