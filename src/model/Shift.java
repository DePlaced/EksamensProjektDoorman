package model;

import java.sql.Date;

public class Shift {
	  private int shiftId;
	    private Date shiftDate;
	    private String checkInTime;
	    private String checkOutTime;
		private int barId;
		private int doormanId;

	    public Shift(int shiftId, Date shiftDate, String checkInTime, String checkOutTime, int barId, int doormanId) {
	        this.shiftId = shiftId;
	        this.shiftDate = shiftDate;
	        this.checkInTime = checkInTime;
	        this.checkOutTime = checkOutTime;
	        this.barId = barId;
	        this.doormanId = doormanId;
	    }

	   
	    public int getShiftId() {
	        return shiftId;
	    }

	    public void setShiftId(int shiftId) {
	        this.shiftId = shiftId;
	    }

	
	    public Date getShiftDate() {
	        return shiftDate;
	    }

	    public void setShiftDate(Date shiftDate) {
	        this.shiftDate = shiftDate;
	    }

	 
	    public String getCheckInTime() {
	        return checkInTime;
	    }

	    public void setCheckInTime(String checkInTime) {
	        this.checkInTime = checkInTime;
	    }

	 
	    public String getCheckOutTime() {
	        return checkOutTime;
	    }

	    public void setCheckOutTime(String checkOutTime) {
	        this.checkOutTime = checkOutTime;
	    }
	    
	    public int getBarId() {
	    	return barId;
	    }
	    
	    public void setBarId(int barId) {
	    	this.barId = barId;
	    }
	    
	    public int getDoormanId() {
	    	return doormanId;
	    }
	    
	    public void setDoormanId(int doormanId) {
	    	this.doormanId = doormanId;
	    }
	}

