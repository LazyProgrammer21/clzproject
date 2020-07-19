package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.assignment.db.database;


public class courseSubjectImpl implements course {
	
	Connection con = null;
	public courseSubjectImpl() {
		con=database.getDBConnection();
	}
	
	
	public List<String> getAllcourse() {
		List<String> lcourse = new ArrayList<String>();
		String sql = "select * from subjectcourse";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
				lcourse.add(rs.getString("Name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(lcourse);
		
		return lcourse;
	}


	@Override
	public String getcourseDescription() {
		String x,y,total=null;
		String concate = "@@hello@@";
		String sql = "select * from subjectcourse";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			y = rs.getString(3);
			rs.next();
			x = rs.getString(3);
			total = x+concate+y;
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return total;
	}
	}



