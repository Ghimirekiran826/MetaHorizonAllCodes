package com.exceptionTest;

import com.mylibrary.BasicIO;

class LowRange extends Exception {
	public LowRange(String message) {
		super(message);
	}
}

class HighRange extends Exception {
	public HighRange(String message) {
		super(message);
	}
}

public class ExceptionTestTwo {

	public static void main(String[] args) { // throws LowRange,HighRange
		int age;
		try {
			BasicIO.printMessage("Enter age");
			age = BasicIO.readInt();
			if (age < 18) {
				throw new LowRange("Age low");
			} else if (age > 18) {
				throw new HighRange("Age low");
			} else {
				BasicIO.printMessage("Age status ", "In Range");
			}

		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (LowRange e) {
			System.out.println(e);
		} catch (HighRange e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
