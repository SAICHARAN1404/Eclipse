package com.Arrays;

public class Armmethod2 {

	public static void main(String[] args) {
		M2 m=new M2();
		int a[]=new int[] {10,5,21,153,258,1,9,15};
		int result=m.Forloop(a,0);
		
	}
}
class M2
{
	public int Forloop(int i[],int count2)
	{
		int count,sum=0,rem,x;
		for( x=0;x<i.length;x++)
		{
			 count=0;
			 sum=0;
			for(int a=i[x];a>0;a/=10)
			{
				count++;
			}
			//System.out.println(count);
			for(int j=i[x];j>0;j/=10)
			{
				rem=j%10;
				sum=sum+(int)Math.pow(rem,count);
			}
			if(sum==i[x])
				System.out.println(i[x]);
			
		}
		return count2;	

	}
	
}
