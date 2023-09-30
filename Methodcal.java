package com.Package1;

class Student//Student class
{	
	String name;
	int roll;
	double obtmarks,totalmarks,percentage;
	void calPercentage()
	{
		percentage=obtmarks/totalmarks*100;
	}
	void calDisplay()
	{
		System.out.println("name ="+name+" "+"roll= "+roll+" "+"percentage= "+percentage);
	}
}


public class Methodcal 
{
	public static void  main (String args[])
	{
		Student st=new Student();//calling Student class by creating new reference variable named "st"//
		st.name="sai charan";st.roll=205;st.obtmarks=89;st.totalmarks=100;//initializing values to "st" variable//
		Student s1=new Student();//calling Student class by creating new reference variable named "s1"//
		s1.name="pavan";s1.roll=204;s1.obtmarks=99;s1.totalmarks=100;//initializing values to "s1" variable //
		st.calPercentage();st.calDisplay();//calling calPercentage and caldDisplay class with "st" values //
		s1.calPercentage();s1.calDisplay();//calling calPercentage and caldDisplay class with "s1" values //
	}

}
