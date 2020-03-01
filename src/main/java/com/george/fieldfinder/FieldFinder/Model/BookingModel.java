package com.george.fieldfinder.FieldFinder.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class BookingModel {
	
	@Id
	@GeneratedValue
	private int id;
	private String clientName;
	private TerenModel teren;
	private String date;
	private String time;
	private boolean isAvailable;
	
	public BookingModel() {}
	
	
	public BookingModel(int id, String clientName, TerenModel teren, String date, String time, boolean isAvailable) {
		super();
		this.id = id;
		this.clientName = clientName;
		this.teren = teren;
		this.date = date;
		this.time = time;
		this.isAvailable = isAvailable;
	}



	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TerenModel getTeren() {
		return teren;
	}
	public void setTeren(TerenModel teren) {
		this.teren = teren;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {
		return "BookingModel [id=" + id + ", clientName=" + clientName + ", teren=" + teren + ", date=" + date
				+ ", time=" + time + ", isAvailable=" + isAvailable + "]";
	}



}
