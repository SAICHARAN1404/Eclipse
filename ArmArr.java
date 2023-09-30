package com.Arrays;

public class ArmArr {

	public static void main(String[] args) {
		
		Add a1=new Add();
		a1.forLoop();
	}

}
class Add
{
	int a[]=new int[] {10,5,21,153,258,1,9,15};
	int count,rem,sum=0;
	public void forLoop()
	{
		for(int x=0;x<a.length;x++)
		{
			 count=0;
			 sum=0;
			for(int i=a[x];i>0;i/=10)
			{
				count++;
			}
			//System.out.println(count);
			for(int j=a[x];j>0;j/=10)
			{
				rem=j%10;
				sum=sum+(int)Math.pow(rem,count);
			}
			if(sum==a[x])
			System.out.println(a[x]);
		}
		
	}
}
