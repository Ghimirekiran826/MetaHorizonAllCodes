package com.JDBC;
import com.mylibrary.BasicIO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertRecord {
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
			String sql = "insert into tbl_person values (101,'Kiran Ghimire','KTM')";
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Inserted Scuessfully");
			conn.close();
			BasicIO.printMessage("Sucessfully Connected");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
}
