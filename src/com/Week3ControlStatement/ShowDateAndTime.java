package com.Week3ControlStatement;
import java.time.LocalDateTime;

public class ShowDateAndTime {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
        try {
            System.out.println(localDateTime.getMonth()+"/"+localDateTime.getDayOfMonth()+"/"+localDateTime.getYear());
            System.out.println(localDateTime.getSecond()+":"+localDateTime.getMinute()+":"+localDateTime.getHour());
        }
        catch(Exception ex) {
            System.out.println("Error : "+ex.getMessage());
        }
        finally {
            System.out.println("Finally!");
        }
	        
	    }
	}

