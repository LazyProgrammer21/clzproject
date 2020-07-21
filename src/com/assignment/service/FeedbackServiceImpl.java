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
import com.assignment.model.FeedbackInfo;

import net.proteanit.sql.DbUtils;

public class FeedbackServiceImpl {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public FeedbackServiceImpl() {
		con=database.getDBConnection();
	}
	
	public void viewEvent(JTable table) {
		// TODO Auto-generated method stub
		try 
		{String query ="Select * from  feedback";
		pst = con.prepareStatement(query);
		rs =pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
	    
		
		} 
		
		catch (SQLException ex) 
		{
		    ex.printStackTrace();
		}
		
	}
	
	public void insertedUpdateDeleteStudent(char Operation,int id,String subject,String description){
    
        
   
   
        if (Operation =='i')
        {   
            
            try{
                
                String abc="INSERT INTO feedback(subject,description)"+"values(?,?)";
                pst=con.prepareStatement(abc);
              
                pst.setString(1,subject);
                pst.setString(2,description);
                if(pst.executeUpdate()>0){
                //int executeUpdate = ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"feedback registered");}
                
        }
        catch(SQLException e){
           e.printStackTrace();}}
        else if(Operation=='U')
        {
            try{
            	
            	String query="UPDATE feedback SET subject =?,description=? WHERE id=?";
                  pst = con.prepareStatement(query);
                  pst.setInt(3,id);
                  pst.setString(1,subject);
                  pst.setString(2,description);
                  if(pst.executeUpdate()>0){
                      //int executeUpdate = ps.executeUpdate();
                      JOptionPane.showMessageDialog(null,"Updated success");}
                      
              }
              catch(SQLException e){
                 e.printStackTrace();}
              }
        else if(Operation=='D') {
        	try{String query="DELETE FROM feedback WHERE id="+id; 
            pst=con.prepareStatement (query);
//            pst.setInt(1,id);
          
            if(pst.executeUpdate()>0){
            //int executeUpdate = ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted Successesfully");}
            
    }
    catch(SQLException e){
       e.printStackTrace();}
    }
    }
    
	public void setTableClickable(JTable table,FeedbackInfo fi) {
		try{  DefaultTableModel model = (DefaultTableModel)table.getModel();

        //get the selected row index
        int selectedRowIndex = table.getSelectedRow();

        //set the selected row data into JLabels
        String id =  model.getValueAt(selectedRowIndex, 0).toString();
        String subject =  model.getValueAt(selectedRowIndex, 1).toString();
        String description =  model.getValueAt(selectedRowIndex, 2).toString();
        String date =  model.getValueAt(selectedRowIndex, 3).toString();
       
        fi.setId((Integer.valueOf(id)));
        fi.setSubject(subject);
        fi.setDescription(description);
        fi.setDate(date);
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
        JOptionPane.showMessageDialog(null, "not connected");
    }
	}

   
	public void orderedByDate(JTable table) {
		try {String query ="Select * from  feedback order by feed_date ";
		pst = con.prepareStatement(query);
		
		rs =pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
	    
		
		} 
		
		catch (SQLException ex) 
		{
			 JOptionPane.showMessageDialog(null,ex);
		}
		
	}
	
	 public boolean verifText(FeedbackInfo fi){
		    if(fi.getSubject().equals("")|| fi.getDescription().equals(""))
		  
		    {
		    JOptionPane.showMessageDialog(null,"One or more empty feilds");
		    return false;}
		    else
		    return true;}
	
}