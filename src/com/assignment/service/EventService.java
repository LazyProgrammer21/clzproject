package com.assignment.service;

import java.sql.Date;

import javax.swing.JTable;

import com.assignment.model.EventInfo;
import com.toedter.calendar.JDateChooser;

public interface EventService {
        public void viewEvent(JTable table);
        public void setValue(JTable table,EventInfo info);
        void search(JTable table,String a,String b);
        boolean insertedUpdateDeleteEvent(char Operation,int id,String eventname,Date startdate,Date enddate,String description,int club,int venue);
}