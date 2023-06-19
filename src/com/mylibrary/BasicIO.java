package com.mylibrary;
import java.util.Scanner;
public class BasicIO {
	public static void printMessage(String message)
	{
		System.out.println(message);
	}
	public static void printMessage(String label,String message)
	{
		System.out.println(label+":"+message);
	}
	public static void printMessage(String label,double message)
	{
		System.out.println(label+":"+message);
	}
	public static void printMessage(char label,String message)
	{
		System.out.println(label+":"+message);
	}
	public static void printMessage(String label,int message)
	{
		System.out.println(label+":"+message);
	}
	public static void newLine()
	{
		System.out.println();
	}
	public static String readString()
	{
		return new Scanner(System.in).nextLine();
	}
	public static int readInt()
	{
		return Integer.parseInt(readString());
	}
	public static double readDouble()
	{
		return Double.parseDouble(readString());
	}
	public static float readFloat()
	{
		return Float.parseFloat(readString());
	}
	public static char readCharacter()
	{
		return (new Scanner(System.in).next().charAt(0));
	}
	public static void main(String[] args) {
		
	}
}
