package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.assignment.db.database;

public class adminServiceImpl implements adminService {
	
	Connection con=null;
	
	public adminServiceImpl(){
		con=database.getDBConnection();
		
	}

	@Override
	public boolean change_AdminKey(String adminkey) {
		boolean x=false;
	
		try {
			String sql =  "update adminrecord set ADMINKEY = \'"+adminkey+"'"+"where ID=1";
			PreparedStatement st = con.prepareStatement(sql);
			st.execute();
			
			x=true;
			
		}
		catch(SQLException e) {
			x=false;
			System.out.println("helo");
		}

		
		
		
		
		return x;
	}

	@Override
	public String getadminKey() {
		String key=null;
		String sql = "select adminkey from adminrecord";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			rs.next();
			key=rs.getString(1);
		
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

		
		
		return key;
	}

}
