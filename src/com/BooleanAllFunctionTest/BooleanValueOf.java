package com.BooleanAllFunctionTest;

public class BooleanValueOf {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");
		boolean result = b1.valueOf(false);
		boolean anotherresult = b2.valueOf("true");
		System.out.println("Result of value of default type= "+result);
		System.out.println("Result of value of string paramterer type = "+anotherresult);
		//valueof function returns static boolean represnted by boolean value
		//valuof(String s) function returns static boolean represented by specified string
	}
}
