package com.Week3ControlStatement;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;




public class TestReadAndWriteCharacter {
	

	
	    public static void main(String[] args) {
	        String filePath = "/Users/kiranghimire/Documents/temp/exampletwo"; // Replace with the actual file path
	        
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            String content = "Hello";
	            writer.write(content);
	            System.out.println("Characters written to the file successfully.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
	    }
	}