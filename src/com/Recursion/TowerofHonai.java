package com.Recursion;
import com.mylibrary.BasicIO;
public class TowerofHonai {
	
	public static void TOH(int n, String so, String de, String he)
	{
		if(n<=0)
		{
			return;
		}
		else
		{
			TOH(n-1, so, he, de);
			BasicIO.printMessage("Disk "+n+" moved from "+so+" to"+" destination");
			TOH(n-1, he, de, so);
		}
	}
	public static void main(String[] args) {
		TOH(3, "Source", "Destination", "Helper");
	}
}
