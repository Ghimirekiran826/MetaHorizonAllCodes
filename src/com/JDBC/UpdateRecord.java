package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mylibrary.BasicIO;

public class UpdateRecord {
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
			String sql = "update tbl_person set name = 'Leo Messi' where pid = 1";
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Updated Scuessfully");
			conn.close();
			BasicIO.printMessage("Sucessfully Changed");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
