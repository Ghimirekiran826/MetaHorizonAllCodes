package com.Week2;
import javax.swing.*;
public class Mywindow {
	JFrame f;
	JTextField t1,t2,t3;
	JButton b1;
	JLabel l1,l2,l3;
	public Mywindow()
	{
		f = new JFrame("Login");
		l1 = new JLabel("Number 1");
		l1.setBounds(10,50,100,30);
		t1 = new JTextField();
		t1.setBounds(120, 50, 150, 30);
		

		l2 = new JLabel("Number 1");
		l2.setBounds(10,100,100,30);
		t2 = new JTextField();
		t2.setBounds(120,100, 150, 30);
		
		b1 = new JButton("Add");
		b1.setBounds(180,150, 80, 30);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		
		
		f.setSize(1000, 1000);
		f.setResizable(false);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Mywindow();
	}
}
