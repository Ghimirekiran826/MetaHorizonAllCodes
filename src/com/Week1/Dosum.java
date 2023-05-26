package com.Week1;
import java.util.Scanner;
public class Dosum {
	public static void main(String[] args) {
		int num1,num2,sum;
		System.out.println("Enter first number");
		num1 = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Enter second number");
		num2 = Integer.parseInt(new Scanner(System.in).nextLine());
		sum = num1+num2;
		System.out.println("Addition  = "+sum);
		
		
	}
}
