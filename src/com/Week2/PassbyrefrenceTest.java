package com.Week2;

public class PassbyrefrenceTest {
	public static void showdata(PassByRefrence p1)
	{
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;
		System.out.println(p1);
	}
public static void main(String[] args) {
	PassByRefrence p1;
	p1 = new PassByRefrence();
	p1.x=5;
	p1.y=6;
	System.out.println(p1);
	showdata(p1);//pass by refrences
	System.out.println(p1);
}
}
