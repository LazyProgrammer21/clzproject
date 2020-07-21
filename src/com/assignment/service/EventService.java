package com.assignment.service;

import javax.swing.JTable;

import com.assignment.model.EventInfo;

public interface EventService {
        public void viewEvent(JTable table);
        public void setValue(JTable table,EventInfo info);
        void fillableEventTable();
        void search(JTable table,String a,String b);
}