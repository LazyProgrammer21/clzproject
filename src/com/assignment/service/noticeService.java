package com.assignment.service;

import java.util.List;

import com.assignment.model.noticeinfo;

public interface noticeService {
	
	List<noticeinfo> getAllNotice();
	Boolean deleteNotice(int id);
	
	boolean issueNotice(noticeinfo issuenotice);
	public noticeinfo getByID(int id);

}
