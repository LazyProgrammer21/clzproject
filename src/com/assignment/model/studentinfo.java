package com.assignment.model;

import java.math.BigInteger;
import java.sql.Date;

public class studentinfo {

	private BigInteger clzId;
	
	private String Name;
	private String Email;
	private Date dob;
	private String gender;
	private String Add_city;
	private String Add_state;
	private String zipCode;
	private String phone;
	private String passWord;
	private String Status;
	private int uniID;
	private String subject;
	private String semseter;
	private String Section;
	
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSemseter() {
		return semseter;
	}
	public void setSemseter(String semseter) {
		this.semseter = semseter;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getUniID() {
		return uniID;
	}
	public void setUniID(int uniID) {
		this.uniID = uniID;
	}
	public BigInteger getClzId() {
		return clzId;
	}
	public void setClzId(BigInteger clzId) {
		this.clzId = clzId;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdd_city() {
		return Add_city;
	}
	public void setAdd_city(String add_city) {
		Add_city = add_city;
	}
	public String getAdd_state() {
		return Add_state;
	}
	public void setAdd_state(String add_state) {
		Add_state = add_state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
	
}
