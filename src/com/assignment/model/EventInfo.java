package com.assignment.model;

import java.sql.ResultSet;

public class EventInfo {
			private int eventID;
			private String eventName;
			private String eventDescription;
			private String eventVenue;
			private String eventStartDate;
			private String eventEndDate;
			private String eventOrganiser;
			
			public int getEventID() {
				return eventID;
			}
			public void setEventID(int eventID) {
				this.eventID = eventID;
			}
			public String getEventName() {
				return eventName;
			}
			public void setEventName(String eventName) {
				this.eventName = eventName;
			}
			public String getEventDescription() {
				return eventDescription;
			}
			public void setEventDescription(String eventDescription) {
				this.eventDescription = eventDescription;
			}
			public String getEventVenue() {
				return eventVenue;
			}
			public void setEventVenue(String eventVenue) {
				this.eventVenue = eventVenue;
			}
			public String getEventStartDate() {
				return eventStartDate;
			}
			public void setEventStartDate(String eventStartDate) {
				this.eventStartDate = eventStartDate;
			}
			public String getEventEndDate() {
				return eventEndDate;
			}
			public void setEventEndDate(String eventEndDate) {
				this.eventEndDate = eventEndDate;
			}
			public String getEventOrganiser() {
				return eventOrganiser;
			}
			public void setEventOrganiser(String eventOrganiser) {
				this.eventOrganiser = eventOrganiser;
			}
			
			
}