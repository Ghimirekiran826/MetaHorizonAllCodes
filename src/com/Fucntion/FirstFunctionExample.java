package com.Fucntion;
import com.mylibrary.BasicIO;
public class FirstFunctionExample {
	static int firstNum,secondNumber;
	public static void sum(int x, int y)
	{
		System.out.println("Sum = "+(x+y));
	}
	public static int readFirstNum()
	{
		BasicIO.printMessage("Enter first number");
		 firstNum =  BasicIO.readInt();
		 return firstNum;
	}
	public static int readSecondNum()
	{
		BasicIO.printMessage("Enter second number");
		 secondNumber =  BasicIO.readInt();
		 return secondNumber;
	}
	public static void main(String[] args) {
		 sum(readFirstNum(),readSecondNum());
	}
}
