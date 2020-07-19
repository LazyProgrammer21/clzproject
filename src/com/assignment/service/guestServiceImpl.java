package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assignment.db.database;

public class guestServiceImpl implements guestService{
	Connection con =null;
	
	public guestServiceImpl() {
		con= database.getDBConnection();
		
	}

	@Override
	public Boolean addnewGuest(String Email) {
	
		String sql ="insert into guestdata (email) values(?)";
	
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, Email);
			stmt.execute();
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return null;
	}

}
