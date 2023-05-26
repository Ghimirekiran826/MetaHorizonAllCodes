package com.Week2;

public class AddImplClass implements AddInterface{

	@Override
	public  int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args) {
		AddInterface obj = new AddImplClass();
		System.out.println("Addiiton = "+obj.add(2,3));
	}
}
