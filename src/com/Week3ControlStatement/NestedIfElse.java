package com.Week3ControlStatement;
import com.mylibrary.BasicIO;
public class NestedIfElse {
	public static void main(String[] args) {
		int num1,num2,num3;
		num1=4;
		num2=5;
		num3=6;
		if(num1>num2)
			if(num1>num3)
				BasicIO.printMessage(num1+"");
		if(num2>num1)
			if(num2>num3)
				BasicIO.printMessage(num2+"");
		if(num3>num1)
			if(num3>num2)
				BasicIO.printMessage(num3+"");
	
}
	}
