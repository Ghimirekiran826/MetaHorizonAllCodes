package com.BooleanAllFunctionTest;

public class BooleanComparetoFunction {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("kiran Ghimire");
		int result = b1.compareTo(b2);
		int anotherresult = b2.compareTo(b3);
		System.out.println("result of compare to function = "+result);
		System.out.println("result of compare to another function = "+anotherresult);
		//return value of compare and compareto function of boolean are same in java
	}
}
