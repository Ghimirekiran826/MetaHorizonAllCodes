package com.Week3ControlStatement;
import com.mylibrary.BasicIO;
public class AndOperatorinStatement {
	public static void main(String[] args) {
		int num1,num2,num3;
		num1=4;
		num2=5;
		num3=6;
		
		if(num1>num2 && num1>=num3)
		{
			BasicIO.printMessage("Largest Number", num1);
		}
		if(num2>num1 && num2>=num3)
		{
			BasicIO.printMessage("Largest Number", num2);
		}
		if(num3>num1 && num3>=num2)
		{
			BasicIO.printMessage("Largest Number", num3);
		}
	}
}
