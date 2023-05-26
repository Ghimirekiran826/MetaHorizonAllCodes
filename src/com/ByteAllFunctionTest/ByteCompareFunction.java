package com.ByteAllFunctionTest;

public class ByteCompareFunction {
	public static void main(String[] args) {
		byte bytevalue = 8,anothervalue = 4;
		Byte b = new Byte(bytevalue);
		int result = b.compare( bytevalue,anothervalue);
		int r=b.compareTo(bytevalue);
		System.out.println("FInal result of compare byte function = "+result);
		System.out.println("FInal result of compare byte function = "+r);
	}
}
