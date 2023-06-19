package com.Week3ControlStatement;
import java.util.Scanner;
public class SingleIf {
	
	public static void validateage()
	{
		int age;
		boolean result;
		System.out.println("Enter your age");
		age = Integer.parseInt(new Scanner(System.in).nextLine());
		result = (age>18);
		if(result)
		{
			System.out.println("You are eligible to vote for election");
		}
	}
	
	
	public static void main(String[] args) {
		validateage();
	}
}
