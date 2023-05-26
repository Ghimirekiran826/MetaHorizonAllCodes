package com.Week2;

public class VisbilityandLifetime {
	static void show()
	{
		//System.out.println(x+y);//we cannot access local values inside another function
	}
	static void disp(int a,int b)
	{
		a++;
		b++;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=5;
		disp(a,b);
	}
}
