package com.Week2;

public class TypecastingAndConversionClass {
	public static void main(String[] args) {
		//type casting
		//upgrade byte-short-int-long-float-double
		//down grade double-float-long-int-short-byte
		//type conversion
		//String - numeric
		//numeric - String
		//automatic type conversion done by JVM itself
		byte bn = 12;
		short sn= bn;
		int in = sn;
		long ln = in;
		float fn = ln;
		double dn = fn;
		
		
		//widening type conversion done by user
		dn= 122222.456789;
		float f = (float) dn;
		long l = (long) f;
		int num = (int) l;
		short s = (short) num;
		byte b = (byte) s;
		System.out.println(b);
		
		String str1 = "3456.66666";
		double doub = Double.parseDouble(str1);
		System.out.println(doub+2);
		double dob = 11;
		String convert = Double.toString(dob);
		System.out.println(convert+1);
	}
}
