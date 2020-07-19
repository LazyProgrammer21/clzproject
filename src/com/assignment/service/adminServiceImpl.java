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
		String sql = "update adminrecord set adminkey="+adminkey+" where id=1";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.execute();
			
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

		
		
		
		
		return false;
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
