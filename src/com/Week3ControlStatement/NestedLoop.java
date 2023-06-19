package com.Week3ControlStatement;
import com.mylibrary.BasicIO;
public class NestedLoop {

	public static void main(String[] args) {
//		int start;
//		for(start=1;start<=5;start++)
//		{
//			System.out.println(start);
//		}
//		BasicIO.newLine();
//		for(start=5;start>=1;start--)
//		{
//			System.out.println(start);
//		}
		int start1,start2,stop1,stop2;
		start1=1;
		start2=6;
		stop1=5;
		stop2=10;
		
		while(start1<=stop1)
		{
			System.out.println(start1);
			BasicIO.newLine();
			start2=6;
			stop2=10;
			while(start2<=stop2)
			{
				System.out.println(start2);
				start2++;
			}
			start1++;
		}
		
	}

}
