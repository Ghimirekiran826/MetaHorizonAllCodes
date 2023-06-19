package com.Week3ControlStatement;
import com.mylibrary.BasicIO;
public class SwitchExampleOne {
	public static void main(String[] args) {
		BasicIO.printMessage("Enter any number 1-7: ");
		int day;
		day = BasicIO.readInt();  //check every condition until condition not found else goto else part
//		if((day<1) || (day>7))
//		{
//			System.out.println("Out of range");
//		}
//		else if(day == 1)
//		{
//			System.out.println("Sunday");
//		}
//		else if(day == 2)
//		{
//			System.out.println("Monday");
//		}
//		else if(day == 3)
//		{
//			System.out.println("Tueday");
//		}
//		else if(day == 4)
//		{
//			System.out.println("Wednesday");
//		}
//		else if(day == 5)
//		{
//			System.out.println("Thursday");
//		}
//		else if(day == 6)
//		{
//			System.out.println("Friday");
//		}
//		else if(day == 7)
//		{
//			System.out.println("Saturday");
//		}
//		else
//		{
//			System.out.println("Error");
//		}
		switch(day)            //switch case directly jumps into the cases available if not 
							//got to default block
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Input Valid Input");
		}
	}
}
