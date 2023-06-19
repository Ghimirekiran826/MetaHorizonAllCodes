package com.Week3ControlStatement;

public class TestProgramToSleep {
	public static void main(String[] args) {
		int start=1,stop=5;
		while(start<=stop)
		{
            System.out.println(start);

            try {
                Thread.sleep(5000); // 5000 milliseconds = 5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);//e.getMessage()
            }
            start++;
        }
    }
}
