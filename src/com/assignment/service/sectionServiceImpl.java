package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.assignment.db.database;


public class sectionServiceImpl implements sectionService {
	Connection con = null;
	public sectionServiceImpl() {
		con=database.getDBConnection();
	}
	@Override
	public List<String> getAllsection() {
		List<String> lsec = new ArrayList<String>();
		String sql = "select * from section";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				lsec.add(rs.getString(2));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(lsec);
		
		return lsec;
	}



}
