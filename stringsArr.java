package com.Quotioneer;

public class stringsArr {
	public static void main(String[] args) {
		String[] s= new String[] {"Hi","Hello","Good Morning"};
		Add a=new Add ();
		a.calAdd(s);
		
	
	}
}
class Add
{
public void calAdd(String i[])
{
		for(int st=0;st<i.length;st++)
		System.out.println(i[st]);
}	
}