package com.Week1;

import java.awt.DisplayMode;

public class SecondVersionofDataTypes {
	public static void main(String[] args) {
		//basic data types int,float,
		//double, boolean, long ,byte
		//Extended types String,object
		//User Defined Types class
		TestClassForDataType obj = new TestClassForDataType();
		obj.result=false;
		System.out.println(obj.result);
		obj.ch='k';
		System.out.println(obj.ch);
		System.out.println(obj.bn);
		TestClassForDataType obj1 = new TestClassForDataType();
		TestClassForDataType obj2 = new TestClassForDataType();
		//assigning one object to another object of class
		obj2 = obj1;
		obj1.ch='H';
		System.out.println(obj2.ch);
		obj2.ch='U';
		System.out.println(obj1.ch);
		//hascode is to know whether the pointer objects are 
		//pointing to same memory address
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		ThirdVersionofDataTypes obj31 = new ThirdVersionofDataTypes();
		ThirdVersionofDataTypes obj32 = new ThirdVersionofDataTypes();
		obj31.num1 = 3;
		obj32.num2 = 4;
		System.out.println(obj31.num1+","+obj31.num2);
		System.out.println(obj32.num1+","+obj32.num2);
		ThirdVersionofDataTypes.num2=5;
		System.out.println(ThirdVersionofDataTypes.num2);
		FourthVersionofDataTypes obj41 = new FourthVersionofDataTypes();
		obj41.show();
		FourthVersionofDataTypes.disp();
		//FourthVersionofDataTypes obj42;
		//FourthVersionofDataTypes.show();
		//obj42.show();
		//obj42.disp();
	}

}
