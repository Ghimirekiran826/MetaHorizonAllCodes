package com.jdbcversion3;


import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import com.Global.Global;
import com.mylibrary.BasicIO;
import java.util.*;
public class CRUDV1 extends MySqlConnection {
	public boolean insert(int pid,String name, String address)
	{
		boolean result = false;
		String sql = "INSERT into tbl_person values(?,?,?)";
		try {
			Connection conn = connect();
			//Insert Record
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.executeUpdate();
			pstmt.close();
			close(conn);
		 result = true;
		}
		catch(Exception ex)
		{
			BasicIO.printMessage(ex.getMessage());
		}
		return result;
	}
	public boolean search(int pid)
	{
		boolean result = false;
		Global.pid = -1;
		try {
			String sql = "Select * from tbl_person where pid = ?";
			Connection conn = connect();
			//Search Record
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				result = true;
				Global.pid = rs.getInt("pid");
				Global.name = rs.getString("name");
				Global.address = rs.getString("address");
			}
			pstmt.close();
			rs.close();
			close(conn);
		}
		catch (Exception e) {
			Global.pid = -1;
			System.out.println("Error: "+e.getMessage());
		}
		return result;
	}
	public boolean update(int pid,String name, String address)
	{
		boolean result = false;
		String sql = "UPDATE tbl_person SET name = ?, address = ? WHERE pid = ?";
		try {
			Connection conn = connect();
			//Update Record
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setInt(3, pid);
			int rowsAffected = pstmt.executeUpdate();
			result = rowsAffected > 0;
			pstmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		return result;
	}
	public boolean delete(int pid)
	{
		boolean result = false;
		String sql = "delete from tbl_person where pid = ?";
		try {
			Connection conn = connect();
			//Delete Record
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			result = true;
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		return result;
	}
	
	public boolean selectAll()
	{
		 boolean result = false;
	        String sql = "SELECT pid, name, address FROM tbl_person";
	        try {
	            Connection conn = connect();
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            ResultSet rs = pstmt.executeQuery();
	            DefaultTableModel tblModel = new DefaultTableModel();
	            tblModel.addColumn("PID");
	            tblModel.addColumn("Name");
	            tblModel.addColumn("Address");
	            
	        
	            while (rs.next()) {
	                int pid = rs.getInt("pid");
	                String name = rs.getString("name");
	                String address = rs.getString("address");
	                tblModel.addRow(new Object[]{pid, name, address});
	            }
	    
	            JTable table = new JTable(tblModel);
	            JScrollPane scrollPane = new JScrollPane(table);
	            
	         
	            JFrame frame = new JFrame("Person Data");
	            //added code
	            JButton b1 = new JButton("Export");
	            b1.setBounds(50,250,100,30);
	            frame.add(b1);
	            frame.setSize(200, 200);
	           
	            frame.add(scrollPane);
	            frame.pack();
	            frame.setLayout(null);
	            frame.setVisible(true);
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            
	           
	            rs.close();
	            pstmt.close();
	            conn.close();
	            
	            result = true; 
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        return result;
	    }
	public boolean dbexport()
	{
	 boolean result = false;
	 try {
         String dbName = DBINFO.DBNAME;
         String dbUser = DBINFO.DBUSER;
         String dbPassword = DBINFO.USERPASS;
         String outputFile = "/Users/kiranghimire/Documents/temp";
         
         // Build the command to export the database using mysqldump
         List<String> command = new ArrayList<>();
         command.add("mysqldump");
         command.add("--user=" + dbUser);
         command.add("--password=" + dbPassword);
         command.add("--databases");
         command.add(dbName);
         command.add("--result-file=" + outputFile);
         
         // Create a process builder to execute the command
         ProcessBuilder pb = new ProcessBuilder(command);
         //pb.redirectErrorStream(true);
         pb.inheritIO();
         // Start the process
         Process process = pb.start();
         
         // Wait for the process to complete
         int exitCode = process.waitFor();
         
         if (exitCode == 0) {
             result = true;
             System.out.println("Database export successful.");
         } else {
             System.out.println("Database export failed.");
         }
     }catch (Exception e) {
         e.printStackTrace();
     }
     
     return result;
 }
}
