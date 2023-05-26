package com.Week2;

public class TestFirstInterface implements FirstInterface {

	@Override
	public void show() {
		System.out.println("Hello i am from show function from firstinterface");
		
	}
	public static void main(String[] args) {
		TestFirstInterface t1 = new TestFirstInterface();
		t1.show();
	}
}
