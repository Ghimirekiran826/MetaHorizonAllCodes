package com.BooleanAllFunctionTest;

public class booleanParseBooleanFunction {

	public static void main(String[] args) {
		String str = "kiran";
		String anotherstr = "true";
		Boolean b1 = new Boolean(false);
		boolean result = b1.parseBoolean(str);
		boolean anotheresult = b1.parseBoolean(anotherstr);
		System.out.println("Parse boolean from string value = "+result);
		System.out.println("Parse boolean from string value = "+anotherstr);

	}

}
