package com.BooleanAllFunctionTest;

public class BooleanLogicalFunctions {
	public static void main(String[] args) {
		Boolean a = new Boolean(true);
        Boolean b = new Boolean(false);
        
        boolean resultofand, resultofor, resultofxor;
        resultofand = a.logicalAnd(a, b);
        resultofor = b.logicalOr(a, b);
        resultofxor = a.logicalXor(a, b);
        
        System.out.println("Result of logicaland = "+resultofand);
        System.out.println("Result of logicalor = "+resultofor);
        System.out.println("Result of logicalxor = "+resultofxor);
        //The logical AND (&&) operator evaluates to true only if both a and b are true. 
        //In this case, since b is false, the result is false.
        //The logical OR (||) operator evaluates to true if at least one of the operands is true.
        //In this case, since a is true, the result is true.
        //The logical XOR (^) operator evaluates to true if the operands have different boolean values.
        //In this case, since a is true and b is false, the result is true.
        
	}
	
}
