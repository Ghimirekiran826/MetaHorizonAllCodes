package com.BooleanAllFunctionTest;

public class BooleanComparefunction {

	public static void main(String[] args) {
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("kiran Ghimire");
		int result = Boolean.compare(b1,b2);
		int anotherresult = Boolean.compare(b2,b3);
		System.out.println("result of compare to function = "+result);
		System.out.println("result of compare to another function = "+anotherresult);
		//return value of compare  function of same boolean values are 0
		//return value of compare function of different value is -1
		//for string value if it cannot be converted into boolean value set to false and compare
		//doesnot found the match values returns 1

	}

}
