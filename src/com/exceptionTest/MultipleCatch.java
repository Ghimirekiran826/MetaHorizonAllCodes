package com.exceptionTest;

import java.io.IOException;
import java.sql.SQLException;

import com.mylibrary.BasicIO;

public class MultipleCatch {
	static int x, y, z;

	public static void main(String[] args) {
		try {
			BasicIO.printMessage("Enter first number");
			x = BasicIO.readInt();
			BasicIO.printMessage("Enter second number");
			y = BasicIO.readInt();
			z = x / y;
			System.out.println(z);
		} catch (NumberFormatException n) {
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException n) {
			System.out.println(n);
		} catch (ArithmeticException n) {
			System.out.println(n);
		} catch (Exception n) {
			System.out.println(n);
		}
		finally {
			System.out.println("end");
		}
	}
}
