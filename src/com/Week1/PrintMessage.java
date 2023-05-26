package com.Week1;


//step into and step over concept
public class PrintMessage {
	public static void show()
	{
		System.out.println("Hello from HelloTest class");
	}
	public static void show(String message)
	{
		System.out.println("Message = "+message);
	}
	public static void main(String[] args) {
		show();
		show("Kiran Ghimire");
		show();
		show("Meta Horizon Student");
	}
}
