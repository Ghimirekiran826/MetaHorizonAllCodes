package com.ReadCsvFile;
import java.util.*;
import java.io.*;
import com.mylibrary.BasicIO;
public class Assignment2 {
	public static void main(String[] args) {
		// Declare an array
		// Initialize an array from the number of csv(data.csv) file.
		// Calculate sum and average
		// Find minimum , and max number
		// search specific number 
		// Sort numbers in ASC order and export in csv file.
		// Sort numbers in DEC order and export in csv file.
		// Export (write) sum,  average, minimum and max number in text file 
		
		final int MAX = 100;
		int nums [] = new int[MAX];
		
			//parsing a CSV file into Scanner class constructor  
			try {
				List<List<String>> data = new ArrayList<>();// list of lists to store data
				String file = "/Users/kiranghimire/Documents/temp/Data.csv";// file path
				FileReader fr = new FileReader(file);	// read file 
				BufferedReader br = new BufferedReader(fr);

				// Reading until we run out of lines
				String line = br.readLine();
				while (line != null) {
					List<String> lineData = Arrays.asList(line.split(","));// splitting lines
					data.add(lineData);
					line = br.readLine();
				}

				// printing the fetched data
				for (List<String> list : data) {
					for (String str : list)
						BasicIO.printMessage(str + " ");
					BasicIO.newLine();
				}
				// sum start 
				  int sum = 0,count=0;
		            for (List<String> list : data) {
		                for (String str : list) {
		                    int num = Integer.parseInt(str.trim()); // Convert each string to an integer
		                    sum += num; // Add the number to the sum
		                    count++;
		                }
		            }
		            
		            BasicIO.printMessage("Sum: " + sum);
		            BasicIO.newLine();
		            float average = sum / count;
		            System.out.println("Average = "+average);

				
				br.close();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
	
			}
			finally{
				BasicIO.printMessage(" ");
			}
			}

}