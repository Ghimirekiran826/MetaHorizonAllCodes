package com.Week3ControlStatement;
class Numbers
{
	int x;
	int y;
	int z;
	public String toString()
	{
		return (this.x+","+this.y+","+this.z);
	}
}
public class FunctionAsArray {
	
	public static Numbers sum(int x, int y)
	{
		x++;
		y++;
		Numbers nums = new Numbers();
		nums.x = x;
		nums.y = y;
		nums.z = x+y;
		return nums;
	}
	public static Numbers show(Numbers numbers)
	{
		numbers.x++;
		numbers.y++;
		numbers.z = numbers.x+numbers.y;
		return numbers;
	}
	
	public static int[] add(int x, int y)
	{
		x++;
		y++;
		int nums[] = {x,y,x+y};
		return nums;
	}
	public static void reftovalue(Numbers numbers)
	{
		numbers.x = 9;
		numbers.y = 4;
	}
	public static void main(String[] args) {
		
		
		int[] arr = add(4,8);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(sum(2,3));
		Numbers numbers = new Numbers();
		numbers.x=9;
		numbers.y=9;
		Numbers result = show(numbers);
		System.out.println("Modified numbers.x: " + result.x);
	    System.out.println("Modified numbers.y: " + result.y);
	    System.out.println("Modified numbers.z: " + result.z);
	    
	    Numbers nums = new Numbers();
	    nums.x=0;
	    nums.y=1;
	    System.out.println("Before modification:");
	    System.out.println("nums.x: " + nums.x);
	    System.out.println("nums.y: " + nums.y);
	    reftovalue(nums);
	    System.out.println("After modification:");
	    System.out.println("nums.x: " + nums.x);
	    System.out.println("nums.y: " + nums.y);
	    
	    
	}
}
