package com.assignment.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.assignment.db.database;
import com.assignment.model.EventInfo;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

public class EventServiceImpl  implements EventService{
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	
	public EventServiceImpl() {
		con=database.getDBConnection();
	}
	
	@Override
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


	@Override
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




@Override
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
@Override
	public boolean insertedUpdateDeleteEvent(char Operation,int id,String eventname,Date startdate,Date enddate,String description,int club,int venue){
	    
        
		   
        if (Operation =='i')
        {   
        	  String abc="INSERT INTO eventinfo (event_name, startDate, endDate, Description, club_fk, venue_fk, image_fk)"+"values(?,?,?,?,?,?,1)";
//        	  Date date1=Date.valueOf(startdate);
//        	  Date date2=Date.valueOf(enddate);
//        	  int xe=83;
        	  try{
                
              
                pst=con.prepareStatement(abc);
              
                pst.setString(1,eventname);
                pst.setDate(2, startdate);
                pst.setDate(3, enddate);
                pst.setString(4,description);
                pst.setInt(5,club);
                pst.setInt(6,venue);
//                pst.setInt(7, xe);
                if(pst.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"event added");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}}
        else if(Operation=='U')
        {
            try{
            	
            	String query="UPDATE eventinfo SET subject =?,description=? WHERE id=?";
                  pst = con.prepareStatement(query);
                  pst.setInt(3,id);
                //  pst.setString(1,subject);
                  pst.setString(2,description);
                  if(pst.executeUpdate()>0){
                      //int executeUpdate = ps.executeUpdate();
                      JOptionPane.showMessageDialog(null,"Updated success");}
                      
              }
              catch(SQLException e){
                 e.printStackTrace();}
              }
        else if(Operation=='D') {
        	try{String query="DELETE FROM eventinfo WHERE EVENT_ID=?"; 
            pst=con.prepareStatement (query);
            pst.setInt(1,id);
          
            if(pst.executeUpdate()>0){
            //int executeUpdate = ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted Successesfully");}
            
    }
    catch(SQLException e){
    System.out.println("helo");}
    }
        return true;
    }

}