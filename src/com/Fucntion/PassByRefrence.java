package com.Fucntion;
class Numbers{
	int x;
	int y;
}
public class PassByRefrence {
	
	public static void swap(Numbers nums)
	{
		int temp;
		temp = nums.x;
		nums.x = nums.y;
		nums.y = temp;
		System.out.println(nums.x+","+nums.y);
	}
	public static void swap(int x, int y)
	{
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println(x+","+y);
	}
	public static void main(String[] args) {
		//pass by value
		int x,y;
		x=5;
		y=10;
		System.out.println("Before Swapping");
		System.out.println(x+","+y);
		System.out.println("After Swapping");
		swap(x, y);
		System.out.println("Real Values");
		System.out.println(x+","+y);
		
		System.out.println("pass by refrence");
		//pass by refrence
		Numbers nums = new Numbers();
		nums.x=10;
		nums.y=20;
		System.out.println("Before Swapping");
		System.out.println(x+","+y);
		System.out.println("After Swapping");
		swap(nums); //pass by refrence
		System.out.println(x+","+y);
		
	}
}
