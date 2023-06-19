package com.AssignmentJDBC;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.mylibrary.BasicIO;
public class AllOperationAndCSVIO {
	public static void main(String[] args) {
		try {
			List<List<String>> data = new ArrayList<>();
			String csvFilePath = "/Users/kiranghimire/Documents/temp/Datatoberead.csv";
			FileReader fileReader = new FileReader(csvFilePath);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			
			//reading and splitting data
			String stringfile = bufferReader.readLine();
			while(stringfile!=null)
			{
				List<String> seperateddata = Arrays.asList(stringfile.split(","));
				data.add(seperateddata);
				stringfile = bufferReader.readLine();
			}
			
			//displaying data
			for(List<String> list: data )
			{
				for (String str : list)
				BasicIO.printMessage(str + " ");
				BasicIO.newLine();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
