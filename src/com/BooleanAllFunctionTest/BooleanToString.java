package com.BooleanAllFunctionTest;

public class BooleanToString {
	 public static void main(String[] args) {
	        boolean value = true;
	        Boolean boolObject = Boolean.valueOf(value);

	        String boolString = boolObject.toString();

	        System.out.println("Boolean value: " + value);
	        System.out.println("Boolean object: " + boolObject);
	        System.out.println("Boolean string: " + boolString);
	    }
}
