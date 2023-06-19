package com.Week3ControlStatement;

import com.mylibrary.BasicIO;

public class AssignmentSecond {

	static int start, stop = 10, sum = 0, count = 0, option;
	static double average;
	static String choiceOfUser;
	static {
		BasicIO.printMessage(
				" 1. Sum of 1-10 \n 2. Average of 1-10 \n " + "3. Print Odd 1-10 \n 4. Print Even 1-10" + "\n 5. Exit");

	}

	public static void mainBlock() {
		BasicIO.printMessage("Enter option");
		option = BasicIO.readInt();
		if ((option >= 1) && (option <= 5)) {
			switch (option) {
			case 1:
				sumofOnetoTen();
				BasicIO.newLine();
				break;
			case 2:
				sumofAverage();
				BasicIO.newLine();
				break;
			case 3:
				printOdd();
				BasicIO.newLine();
				break;
			case 4:
				printEven();
				BasicIO.newLine();
				break;
			case 5:
				System.exit(0);

			}
		} else {
			BasicIO.printMessage("Please Insert Valid Input");
		}
	}

	public static void sumofOnetoTen() {
		for (start = 1; start <= stop; start++) {
			sum = sum + start;
			count++;
		}
		BasicIO.printMessage("Sum = " + sum);
	}

	public static void sumofAverage() {
		average = sum / count;
		BasicIO.printMessage("Average  = ", average);
	}

	public static void printOdd() {
		BasicIO.printMessage("Odd numbers are: ");

		for (start = 1; start <= stop; start++) {
			if (start % 2 == 1) {
				System.out.print(start + " ");
			}
		}
	}

	public static void printEven() {
		BasicIO.printMessage("Even numbers are: ");

		for (start = 1; start <= stop; start++) {
			if (start % 2 == 0) {
				System.out.print(start + " ");
			}
		}
	}

	public static void main(String[] args) {
		do {
			mainBlock();
			BasicIO.printMessage("Do you want to continue Press Y for Yes");
			choiceOfUser = BasicIO.readString();
		} while (choiceOfUser.equalsIgnoreCase(choiceOfUser));
	}
}
