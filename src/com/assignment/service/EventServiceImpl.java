package com.assignment.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.assignment.db.database;
import com.assignment.model.EventInfo;

import net.proteanit.sql.DbUtils;

public class EventServiceImpl  implements EventService{
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	
	public EventServiceImpl() {
		con=database.getDBConnection();
	}
	

	public void viewEvent(JTable table) {
		// TODO Auto-generated method stub
		try 
		{String query = "SELECT event_id, event_name, startDate, endDate, Description,clubName,venueName,imgid FROM eventinfo,club,venue,eventimage WHERE club_fk=clubID and venue_fk=venueID and image_fk=imgid";
		pst = con.prepareStatement(query);
		rs =pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
	    
		
		} 
		
		catch (SQLException ex) 
		{
		    ex.printStackTrace();
		}
		
	}


	public void viewEvent() {
		// TODO Auto-generated method stub
		
	}
	public void setValue(JTable table,EventInfo ei) {
		try{  DefaultTableModel model = (DefaultTableModel)table.getModel();

        //get the selected row index
        int selectedRowIndex = table.getSelectedRow();

        //set the selected row data into JLabels
        String id =  model.getValueAt(selectedRowIndex, 0).toString();
        String name =  model.getValueAt(selectedRowIndex, 1).toString();
        String startDate =  model.getValueAt(selectedRowIndex, 2).toString();
        String EndDate =  model.getValueAt(selectedRowIndex, 3).toString();
        String description =  model.getValueAt(selectedRowIndex, 4).toString();
        String organiser =  model.getValueAt(selectedRowIndex, 5).toString();
        String venue =  model.getValueAt(selectedRowIndex, 6).toString();
  
       
        ei.setEventID(Integer.valueOf(id));
        ei.setEventName(name);
        ei.setEventStartDate(startDate);
        ei.setEventEndDate(EndDate);
        ei.setEventDescription(description);
        ei.setEventOrganiser(organiser);
        ei.setEventVenue(venue);

    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null, "not connected");
    }
	}


	public void setValue() {
		// TODO Auto-generated method stub
		
	}


	public void fillableEventTable(JTable table,String a) {
		//filling the event table
		try{   
			String query = "SELECT event_id, event_name, startDate, endDate, Description,clubName,venueName,imgid FROM eventinfo,club,venue,eventimage WHERE CONCAT(`event_id`, `event_name`, `startDate`, `endDate`, `Description`,`clubName`,`venueName`,`imgid`) like ?";
		        pst=con.prepareStatement(query);
		        pst.setString(1,"%"+a+"%");
		        rs =pst.executeQuery();
		        DefaultTableModel model =(DefaultTableModel)table.getModel();
		        Object [] row;
		        while(rs.next()){
		            row = new Object[8];
		            row[0]=rs.getInt(1);
		            row[1]=rs.getString(2);
		            row[2]=rs.getString(3);
		            row[3]=rs.getString(4);
		            row[4]=rs.getString(5);
		            row[5]=rs.getString(6);
		            row[6]=rs.getString(7);
		            row[7]=rs.getInt(8);
		            
		           
		            
		            model.addRow(row);
		        }
		        
		 }
		  catch(SQLException e){
		           e.printStackTrace();}
		
	}


	@Override
	public void fillableEventTable() {
		// TODO Auto-generated method stub
		
	}


	public void search(JTable table,String c,String valueToSearch) {
		// TODO Auto-generated method stub
		String a = "SELECT event_id, event_name, startDate, endDate, Description,clubName,venueName,imgid FROM eventinfo,club,venue,eventimage WHERE club_fk =clubID and venue_fk=venueID and image_fk=imgid and clubName =? and"
				+ " CONCAT( event_name,venueName) like ?";
		try {
			pst=con.prepareStatement(a);
			pst.setString(1,c);
			pst.setString(2,"%"+valueToSearch+"%");
	        
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}