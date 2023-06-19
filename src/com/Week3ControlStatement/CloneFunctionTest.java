package com.Week3ControlStatement;

public class CloneFunctionTest {
//	public static void f1(int num)
//	{
//		
//		System.out.println(num);
//		f1(num+1);
//	}
	public static void f2(int num)
	{
		if(num<=10)
		{
			System.out.println(num);
			f2(num+1);
		}
		
	}
public static void main(String[] args) {
	f2(1);
}
}
