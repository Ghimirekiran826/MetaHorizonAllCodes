package com.exceptionTest;
import com.mylibrary.BasicIO;
public class TestException {
	static int x;
	static int y;
	static int z;
	public static void main(String[] args) {
		
		try {
		BasicIO.printMessage("Enter first number");
		x = BasicIO.readInt();
		BasicIO.printMessage("Enter second number");
		y = BasicIO.readInt();
		}catch(NumberFormatException e)
		{
			System.out.println(e.getClass().getSimpleName()+"."+e.getMessage());
		}
		z = x+y;
		
		BasicIO.printMessage("Addition ", z);
	}
}
