package com.Week3ControlStatement;

public class TestCloneFunction implements Cloneable{
	 int x, y;
	public static void add(int x,int y)
	{
		x++;
		y++;
		System.out.println(x+","+y);
	}
	public static void main(String[] args) {
		TestCloneFunction t1 = new TestCloneFunction();
		t1.x=5;
		t1.y=5;
		System.out.println("Printing By Another object T1");
		System.out.println("Before pass by value");
		System.out.println(t1.x+","+t1.y);
		System.out.println("After pass by value");
		add(t1.x,t1.y);
		System.out.println("Testing original value");
		System.out.println(t1.x+","+t1.y);
		
		try {
			TestCloneFunction t2 = (TestCloneFunction) t1.clone();
			System.out.println("Printing By Another object T2");
			System.out.println(t2.x+","+t2.y);
			t2.x = 10;
			t2.y = 50;
			System.out.println("Updating By Another object T2");
			System.out.println(t2.x+","+t2.y);
			System.out.println("Checking original value changed or not");
			System.out.println(t1.x+","+t1.y);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	}
}
