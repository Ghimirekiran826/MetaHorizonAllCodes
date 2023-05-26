package com.Week1;
import javax.swing.*;
public class MywindowextendingJFrame extends JFrame {
	public MywindowextendingJFrame() {
		setSize(1000, 1000);
		setTitle("Register");
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MywindowextendingJFrame();
	}
}
