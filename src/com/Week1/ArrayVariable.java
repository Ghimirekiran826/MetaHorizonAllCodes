package com.Week1;

import java.sql.ResultSet;

public class ArrayVariable {
		
		char []ch = new char[5];
		int []abc = new int[8];
		public static void main(String[] args) {
			boolean []res = new boolean[5];
			
			res[0]=true;
			res[1]=false;
			//res[-1]=true;
			//res[5]=false;
			res[2]=true;
			res[3]=false;
			res[4]=false;
			//Exception in thread "main"
			//java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
		}
}
