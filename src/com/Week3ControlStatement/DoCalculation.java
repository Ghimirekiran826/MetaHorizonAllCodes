package com.Week3ControlStatement;
import com.mylibrary.BasicIO;
public class DoCalculation {
	static int firstnumber,secondnumber;
	public static void display()
	{
		BasicIO.printMessage("1. Addition ");
		BasicIO.newLine();
		BasicIO.printMessage("2. Subtraction ");
		BasicIO.newLine();
		BasicIO.printMessage("3. Multiplication ");
		BasicIO.newLine();
		BasicIO.printMessage("4. Division ");
		BasicIO.newLine();
		BasicIO.printMessage("5. Exit ");
		BasicIO.newLine();
	}
	public static void readData()
	{
		BasicIO.printMessage("Enter first Number");
		firstnumber = BasicIO.readInt();
		BasicIO.printMessage("Enter second Number");
		secondnumber = BasicIO.readInt();
	}
	public static int add()
	{
		readData();
		return (firstnumber+secondnumber);
	}
	public static int sub()
	{
		readData();
		return (firstnumber-secondnumber);
	}
	public static int mul()
	{
		readData();
		return (firstnumber*secondnumber);
	}
	public static double div()
	{
		BasicIO.printMessage("Enter first Number");
		firstnumber = (int) BasicIO.readDouble();
		BasicIO.printMessage("Enter second Number");
		secondnumber = (int) BasicIO.readDouble();
		return (firstnumber/secondnumber);
	}
	public static void exit()
	{
		System.exit(0);
	}
	
	public static void main(String[] args) {
		int option;
		display();
		BasicIO.printMessage("Enter option");
		option = BasicIO.readInt();
		if((option >= 1)&&(option<=5))
		{
		switch(option)
		{
		case 1:
			BasicIO.printMessage("Addition = ",add());
			break;
		case 2:
			BasicIO.printMessage("Subtraction = ",sub());
			break;
		case 3:
			BasicIO.printMessage("Multiplication = ",mul());
			break;
		case 4:
			BasicIO.printMessage("Division = ",div());
			break;	
		case 5:
			exit();
		}
		}
		else {
			BasicIO.printMessage("Please Insert Valid Input");
		}
	}

}
