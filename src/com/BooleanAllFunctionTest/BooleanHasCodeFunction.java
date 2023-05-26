package com.BooleanAllFunctionTest;

public class BooleanHasCodeFunction {

	public static void main(String[] args) {
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean("true");
		int result = b1.hashCode();
		int anotheresult = b2.hashCode();
		System.out.println("Return value of hascode function of false value"+ result);
		System.out.println("Return value of hascode function of true value "+ anotheresult);
		//for false value hascode return value is 1237 and for true is 1231
		System.out.println(b3.hashCode(false));
		//first of all b3 value is true and then override by false parameter and hascode function
		// returns 1237
		
	}

}
