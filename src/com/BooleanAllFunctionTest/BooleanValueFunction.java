package com.BooleanAllFunctionTest;

public class BooleanValueFunction {
	public static void main(String[] args) {
		BooleanFunctionTestClass testclass1 = new BooleanFunctionTestClass();
		Boolean b1 = new Boolean(false);
		//booleanValue() function returns the boolean value as the boolean object is containing
		boolean result = b1.booleanValue();
		System.out.println("The returned value for boolean b1 object = "+result);
	}
}
