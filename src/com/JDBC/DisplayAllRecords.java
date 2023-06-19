package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mylibrary.BasicIO;
import com.mysql.cj.protocol.Resultset;

public class DisplayAllRecords {
	public static void main(String[] args) {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DBNAME = "sql12624803";
		final String DBPASS = "6p9k3h3bWq";
		final int PORT = 3306;
		final String DBUSER = "sql12624803";
		final String URL = "jdbc:mysql://sql12.freemysqlhosting.net:"+PORT+"/"+DBNAME;
		
		try {
			//Connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL,DBUSER,DBPASS);
			Statement stmt = conn.createStatement();
			String sql = "select * from tbl_person";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("PID\tNAME\t\tADDRESS");
			while(((ResultSet) rs).next())
			{
				System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3));
			}
			
			JOptionPane.showMessageDialog(null, "Display Scuessfully");
			conn.close();
			BasicIO.printMessage("Displayed Sucessfully ");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
