package com.assignment.service;

import javax.swing.JTable;

import com.assignment.model.FeedbackInfo;

public interface FeedbackService {
        public void view();
        public void insertedUpdateDeleteStudent(char Operation,int i,String subject,String description);
        public void setTableClickable(JTable table,FeedbackInfo fi);
        public void viewEvent(JTable table);
        public boolean verifText(FeedbackInfo fi);
        public void orderedByDate(JTable table);
}