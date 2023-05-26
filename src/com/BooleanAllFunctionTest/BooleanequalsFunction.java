package com.BooleanAllFunctionTest;

public class BooleanequalsFunction {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean("false");
		Boolean b3 = new Boolean("kiran Ghimire");
		boolean result =  b1.equals(b2);
		System.out.println(result);
		boolean anotherresult =  b2.equals(b3);
		System.out.println(anotherresult);
		//return true if matching value are same else returns false 
	}
}
