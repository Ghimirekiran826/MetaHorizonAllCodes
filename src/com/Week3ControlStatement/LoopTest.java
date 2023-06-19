package com.Week3ControlStatement;

public class LoopTest {
	public static void main(String[] args) {
		int start = 10;
		int stop = 1;
		while(start>=stop)
		{
			System.out.println(start);
			start--;
			start++; // infite loop
		}
	}
}
