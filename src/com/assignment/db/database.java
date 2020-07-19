package com.assignment.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
	
	public static Connection getDBConnection()
	{
		
	
		try 
		{
			

			    return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","9865457708Ss@");
			
				
		
		} 
		
		catch (SQLException e) 
		{
		    e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}
