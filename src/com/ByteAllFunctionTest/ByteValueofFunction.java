package com.ByteAllFunctionTest;

public class ByteValueofFunction {
	public static void main(String args[])
	{
	    byte b = 42;
        String s = "123";
        String str = "4";

        Byte byteObj = Byte.valueOf(b);
        System.out.println("Byte Value: " + byteObj);

        Byte stringByte = Byte.valueOf(s);
        System.out.println("String Byte Value: " + stringByte);

        Byte bytevalue = Byte.valueOf(str, 16);
        System.out.println(" Byte Value: " + bytevalue);
        
        //valueof(String s, int radix) => confusion in this function
    }
	}

