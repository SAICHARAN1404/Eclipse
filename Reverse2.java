package com.Forloop;

import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args)
	{
		Scanner num=new Scanner(System.in);
		System.out.println("enter a value");
		int a = num.nextInt();
		System.out.println((a%2!=0)?"odd":"even");
		
	}

}
