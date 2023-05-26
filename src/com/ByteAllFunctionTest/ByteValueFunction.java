package com.ByteAllFunctionTest;

public class ByteValueFunction {
	public static void main(String[] args) {
		//for bytevalue function it need Integer class object to return as byte value
		Integer i = new Integer(34);           
	        // Convert Integer number to byte value  
	        byte b = i.byteValue();  
	        System.out.println(b);  
	        

	        // create a Byte object b  
	          Byte b1 = new Byte("80");  
	          // convert Byte Object b to bytePrimitive  
	          byte bytePrimitive = b1.byteValue();           
	          System.out.println("The Byte object is: " + b1 );        
	        String str = "Primitive byte value of Byte object is: "+ bytePrimitive;  
	          // print byte primitive value  
	          System.out.println( str );  
	          
	          
	          Integer integerObject = Integer.valueOf(42);
	          // byteValue() - Returns the value of the Integer as a byte
	          byte byteValue = integerObject.byteValue();
	          System.out.println("Byte value: " + byteValue);
	          
	          // intValue() - Returns the value of the Integer as an int
	          int intValue = integerObject.intValue();
	          System.out.println("Int value: " + intValue);
	          
	          // shortValue() - Returns the value of the Integer as a short
	          short shortValue = integerObject.shortValue();
	          System.out.println("Short value: " + shortValue);
	          
	          // longValue() - Returns the value of the Integer as a long
	          long longValue = integerObject.longValue();
	          System.out.println("Long value: " + longValue);
	          
	          // doubleValue() - Returns the value of the Integer as a double
	          double doubleValue = integerObject.doubleValue();
	          System.out.println("Double value: " + doubleValue);
	          
	}
}
