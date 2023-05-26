package com.Week1;

public class InstanceNOninstanceTestClass {
	public static void main(String[] args) {
		InstanceandNoninstancevariable obj= new InstanceandNoninstancevariable();
		System.out.println(obj.num1+2);
		System.out.println(obj.num3+6);
		System.out.println(InstanceandNoninstancevariable.num2);
		//InstanceandNoninstancevariable.num4=5+4; read only
	}
}
