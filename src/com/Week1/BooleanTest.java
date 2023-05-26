package com.Week1;
import java.lang.Boolean;
public class BooleanTest {

	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		System.out.println(b1);
		System.out.println(b2);
		
		//parameterized constructor for boolean is depreciating in future update of java
		boolean result = b1.booleanValue();
		System.out.println(b1);
		int returvalue = b1.compare(b1,b2);
		System.out.println(returvalue);
		//0 refers to true 
		//1 or other integer refers to other integer
		//static boolean	parseBoolean(String s)
		boolean b3 = b1.parseBoolean("false");
		System.out.println(b3);
		String str1 = b1.toString();
		System.out.println(str1);
		//for boolean we should give either true or false value
		// if we give any other value compiler return false
	}

}
