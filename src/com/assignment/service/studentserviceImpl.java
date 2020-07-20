package com.assignment.service;


import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.assignment.db.database;
import com.assignment.model.noticeinfo;
import com.assignment.model.studentinfo;



public class studentserviceImpl implements studentService{


	Connection con = null;
	
	public studentserviceImpl() {
		
		con = database.getDBConnection();
	
	}
	@Override
	public boolean newRegister(studentinfo student, int courseID, int semID, int sectionID) {
		boolean x=false;
		String sql = "insert into studentinfo(clzID,Name,Email,DOB,Gender,Add_city,Add_state,zipCode,passWord,courseID,semID,sectionID,phone) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		   try 
		   {
			   PreparedStatement stmt = con.prepareStatement(sql);
			   long longval = student.getClzId().longValue();
			
			   stmt.setLong(1, longval);
			   stmt.setString(2, student.getName());
			   stmt.setString(3, student.getEmail());
			   stmt.setDate(4, student.getDob());
			   stmt.setString(5, student.getGender());
			   stmt.setString(6, student.getAdd_city());
			   stmt.setString(7,student.getAdd_state());
			   stmt.setString(8, student.getZipCode());
			   stmt.setString(9, student.getPassWord());
			
			   stmt.setInt(10, courseID);
			   stmt.setInt(11, semID);
			   stmt.setInt(12, sectionID);
			
			   stmt.setString(13, student.getPhone());
			   
			   stmt.execute();
			   
			   x=true;
			
			} 
		   catch (SQLException e) {
			
			      System.out.println(e);
			      x=false;
		    }
			
		
		
	
		return x;
	}
	@Override
	public boolean addStudentadmin(int uniId, String Name) {
		boolean y=false;
		String sql = "insert into AdminStudentrecord(uniID,StudentName) values(?,?)";
		  try 
		   {
			   PreparedStatement stmt = con.prepareStatement(sql);
			
			   stmt.setInt(1,uniId);
			   stmt.setString(2,Name);
		
			   
			   stmt.execute();
			   
			   y= true;
			
			} 
		   catch (SQLException e) {
			
			      System.out.println(e);
		    }
		return y;
		
	}
	@Override
	public long getuniIDdb(BigInteger uid) {
			
			long longvalue_of_uid = uid.longValue();
			long acvalue=0;
		String sql = "select UNIID from ADMINSTUDENTRECORD ";
				
			Statement s;
			try {
				
				s = con.createStatement();
				ResultSet rs = s.executeQuery(sql);
				while(rs.next()) {
			
				if(rs.getLong(1)==longvalue_of_uid) {
					acvalue=rs.getLong(1);
					break;
				}
							
				}
			
			} catch (SQLException e) {
			
//				e.printStackTrace();
				System.out.println("data not checked");
			}
			
			

		return acvalue;

	}
	@Override
	public boolean updateAdmintable(int x) {
		boolean z=false;
		System.out.println(x);
		String status="Taken";
		
		String sql = "update adminstudentrecord set status = \'"+status+"'"+"where uniID="+x;
	try {
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.execute();
		
		z=true;
	
		
	}
	catch(SQLException e ) {

		z=false;
	}
		
		
		
		
		
		return z;
	}
	@Override
	public boolean checkstatuscolumn_of_studentadminrecord(int x) {
		boolean stv=false;

		
		String sql ="select STATUS from adminstudentrecord where uniID="+x;
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rrset = ps.executeQuery();
			
			rrset.next();
	
			String xu = rrset.getString("status");
			if(xu.equals("Taken")) {
				System.out.println("OK");
			}
	
			stv=true;
			
		}
		catch(SQLException e) {

		stv=false;

		}

		return stv;
	
	}
	@Override
	public List<studentinfo> getstudentDetailbyID() {
		//display===
		List<studentinfo> st_info = new ArrayList<>();
		String sql = " select\r\n" + 
				"studentinfo.clzid,studentinfo.name,subjectcourse.name,semester.semester,section.section \r\n" + 
				"from\r\n" + 
				"studentinfo\r\n" + 
				"inner join\r\n" + 
				"semester\r\n" + 
				"on\r\n" + 
				"studentinfo.semid=semester.semid\r\n" + 
				"inner join\r\n" + 
				"section\r\n" + 
				"on\r\n" + 
				"studentinfo.sectionid=section.sectionid \r\n" + 
				"inner join\r\n" + 
				"subjectcourse\r\n" + 
				"on\r\n" + 
				"studentinfo.courseid=subjectcourse.courseid";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				studentinfo sinfo = new studentinfo();
				BigInteger cid =  BigInteger.valueOf(rs.getInt(1));
				sinfo.setClzId(cid);
				sinfo.setName(rs.getString(2));
				sinfo.setSubject(rs.getString(3));
				sinfo.setSemseter(rs.getString(4));
				sinfo.setSection(rs.getString(5));
		
			st_info.add(sinfo);
			
				
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return st_info;

	}
	@Override
	public boolean studentloginIn(BigInteger clzid, String Password) {
		
		System.out.println(clzid);
		System.out.println(Password);
		boolean x= false;
		
		
		String sql = "select clzID,passWord from studentinfo where clzID="+clzid;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next();

			if(rs.getString("PASSWORD").equals(Password)) {
				x=true;
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
			
		}
		
		return x;

	}
	@Override
	public List<studentinfo> getdatafromstudentadminrecord() {
		List <studentinfo> datas = new ArrayList<>();

	

		String sql="select * from adminstudentrecord";
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				studentinfo  s_info = new studentinfo();
			s_info.setUniID(rs.getInt("UNIID"));
			s_info.setName(rs.getString("STUDENTNAME"));
			s_info.setStatus(rs.getString("STATUS"));
				datas.add(s_info);
		}
		}
		catch(SQLException sq) {
			sq.printStackTrace();
		}
		

		return datas;
	}
	@Override
	public studentinfo getStudentdata(int id) {
		studentinfo s_info =new studentinfo();
		String sql ="select * from studentinfo where clzID="+id;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				BigInteger bg = BigInteger.valueOf(rs.getInt("CLZID"));
				s_info.setClzId(bg);
				s_info.setName(rs.getString("NAME"));
				s_info.setEmail(rs.getString("EMAIL"));
				s_info.setDob(rs.getDate("DOB"));
				s_info.setGender(rs.getString("GENDER"));
				s_info.setAdd_city(rs.getString("ADD_CITY"));
				s_info.setAdd_state(rs.getString("ADD_STATE"));
				s_info.setZipCode(rs.getString("ZIPCODE"));
				s_info.setPhone(rs.getString("PHONE"));
				
				
				
			}
			
		}
		catch(SQLException q){
			q.printStackTrace();
			
		}
		
		
		
		
		return s_info;
	}
	@Override
	public boolean deletestudentrecord(int id) {
	
		boolean x=false;
		String sql = "delete from studentinfo where clzid ="+id;
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.executeUpdate(sql);
			x=true;
			
	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return x;
	}
	@Override
	public boolean forgetpasswordupdate(int id, String newpassword) {
	
		boolean x=false;
		String sql = "update studentinfo set PASSWORD = \'"+newpassword+"'"+"where uniID="+id;
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.execute();
			
			x=true;
		
			
		}
		catch(SQLException e ) {

			x=false;
		}
			
		
		
		
		
		return x;
	}
	@Override
	public boolean getallstudentclzid() {
boolean stv=false;

		
		String sql ="select  from adminstudentrecord where uniID="+x;
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rrset = ps.executeQuery();
			
			rrset.next();
	
			String xu = rrset.getString("status");
			if(xu.equals("Taken")) {
				System.out.println("OK");
			}
	
			stv=true;
			
		}
		catch(SQLException e) {

		stv=false;

		}

		return stv;
		return false;
	}





}
