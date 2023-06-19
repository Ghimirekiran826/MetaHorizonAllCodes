package com.Fucntion;

import com.mylibrary.BasicIO;

public class OptimizeCalculatorCode {
	static double firstInput, secondInput, addition,subtraction,multiply,division;
	static char inputoperator;

	public static double sum() {
		return firstInput + secondInput;
	}

	public static double sub() {
		return firstInput - secondInput;
	}

	public static double mul() {
		return firstInput * secondInput;
	}

	public static double div() {
		return firstInput / secondInput;
	}

	public static void main(String[] args) {
		BasicIO.printMessage("Enter first Input Number");
		BasicIO.newLine();
		firstInput = BasicIO.readDouble();
		BasicIO.printMessage("Enter second Input Number");
		BasicIO.newLine();
		secondInput = BasicIO.readDouble();
		BasicIO.printMessage("Enter an operator (+, -, *, /): ");
		inputoperator = BasicIO.readCharacter();

		// switch case for each of the operations
		switch (inputoperator) {
		case '+':
			addition = sum();
			BasicIO.printMessage("Addition = ", addition);
			break;
		case '-':
			subtraction = sub();
			BasicIO.printMessage("Subtraction = ", subtraction);
			break;
		case '*':
			multiply = mul();
			BasicIO.printMessage("Multiplication = ", multiply);
			break;
		case '/':
			division = div();
			BasicIO.printMessage("Divsion = ", division);
			break;
		// operator doesn't match any case constant (+, -, *, /)

		default:
			System.out.printf("Error! operator is not correct");
			
		}

	}
}
