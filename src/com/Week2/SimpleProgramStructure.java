package com.Week2;

public class SimpleProgramStructure {
	public static void main(String[] args) {
		double num1,num2,result; //declaring num1 and num2 as double variable
		
		try {
			num1=5; // 5 is assgined to num1 variable
			num2=0; // 0 is assigned to n um2 variable
			result = num1/num2; //num1 is divided by num2 and stored to result
			System.out.println("Final value  = "+result); //access value of result
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally {
			System.gc();
		}
	}

}
