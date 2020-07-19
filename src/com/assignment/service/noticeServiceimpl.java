package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.assignment.db.database;
import com.assignment.model.noticeinfo;

public class noticeServiceimpl implements noticeService {
	Connection con=null;
	
	public noticeServiceimpl() {
		
		con = database.getDBConnection();
	}

	@Override
	public List<noticeinfo> getAllNotice() {
		List <noticeinfo> n_info = new ArrayList<>();
		String sql = "select * from NOTICEINFO";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				noticeinfo ninfo = new noticeinfo();
				ninfo.setId(rs.getInt("ID"));
				ninfo.setType(rs.getString("TYPE"));
				ninfo.setIssueDate(rs.getDate("DATEISSUED"));
				
			
				n_info.add(ninfo);
			
			}
			
		}
		catch(SQLException e) {
			
		}
		System.out.println(n_info);
		return n_info;
	}

	@Override
	public Boolean deleteNotice(int id) {
		String sql = "delete from noticeinfo where id ="+id;
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.executeUpdate(sql);
	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return true;
	}



	@Override
	public boolean issueNotice(noticeinfo issuenotice) {
		
		String sql = "insert into NOTICEINFO (Type,subject,description,Dateissued) values(?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, issuenotice.getType());
			stmt.setString(2, issuenotice.getSubject());
			stmt.setString(3, issuenotice.getDescription());
			stmt.setDate(4, issuenotice.getIssueDate());
	
	
			
			stmt.execute();
			
			
		}
		catch(SQLException ea) {
			ea.printStackTrace();
		}
		
		
		
		return true;
	}

	@Override
	public noticeinfo getByID(int id) {
		String sql = "select * from noticeinfo where id="+id;
		noticeinfo n_info = new noticeinfo();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				n_info.setSubject(rs.getString("subject"));
				n_info.setDescription(rs.getString("description"));
				
	
		}
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return n_info;
	}
	
	

}
