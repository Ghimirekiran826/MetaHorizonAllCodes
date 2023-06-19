package com.exceptionTest;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class FileClassTest {
	public static void main(String[] args) {
//		File file;
//		boolean result;
//		file = new File("/Users/kiranghimire/Documents");
//		result = file.canExecute();
//		if(result)
//		{
//			System.out.println("File can execute");
//		}
//		else
//		{
//			System.out.println("File cannot execute");
//		}

//		if (file.canRead()) {
//			System.out.println("File can execute");
//		} else {
//			System.out.println("File cannot execute");
//		}
//
//		if (file.canWrite()) {
//			System.out.println("File can write");
//		} else {
//			System.out.println("File cannot write");
//		}
//		long size = file.getTotalSpace(); // returns a disk size
//		System.out.println(size / 1024 / 1024 / 1024);
//		long filesize = file.length();
//		System.out.println(filesize);
		
		
		
		
		//code needs to be reviewed..args.
//		Path srcfile = Path.of("/Users/kiranghimire/Documents/temp");
//		Path destiledir = Path.of("/Users/kiranghimire/Documents");
//		 try {
//			 Path destinationFile = destiledir.resolve(srcfile.getFileName());
//	            Files.copy(srcfile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
//	            System.out.println("File copied successfully.");
//	        } catch (IOException e) {
//	            System.out.println("An error occurred while copying the file.");
//	            e.printStackTrace();
//	        }
//	    }
		
		
		
		File src = new File("/Users/kiranghimire/Documents/temp/exampleone.txt");
		File dest = new File("/Users/kiranghimire/Documents/temp/exampletwo.txt");
		
		try {
			Files.copy(src.toPath(), dest.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}