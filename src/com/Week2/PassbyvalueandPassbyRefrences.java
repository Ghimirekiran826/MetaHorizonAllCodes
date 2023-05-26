package com.Week2;

public class PassbyvalueandPassbyRefrences {
	public static void printpassbyvalue(int a,int b) {
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value of a = "+a);
		System.out.println("value of b = "+b);
	}

	public static void main(String[] args) {
		PassbyvalueandPassbyRefrences p1 = new PassbyvalueandPassbyRefrences();
		int a,b;
		a=4;
		b=8;
		System.out.println("Before swapping");
		System.out.println("Value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("After swapping");
		printpassbyvalue(a, b);
		
	}
}
