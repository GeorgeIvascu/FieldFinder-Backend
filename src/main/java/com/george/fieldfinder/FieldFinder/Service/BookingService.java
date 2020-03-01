package com.george.fieldfinder.FieldFinder.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.george.fieldfinder.FieldFinder.Model.BookingModel;
import com.george.fieldfinder.FieldFinder.Model.TerenModel;


@Service
public class BookingService {

	static TerenModel test = new TerenModel();
	private BookingModel booking;
	static private List<BookingModel> bookings = new ArrayList<>();
	private List<BookingModel> succesfullBookings = new ArrayList<>();
	
	static {
		bookings.add(new BookingModel(1, "Client 1", test, new Date().toString(), Calendar.getInstance().getTime().toString(), true));
	}
	
	public List<BookingModel> getAllBookings() {
		return bookings;
		
	}
	
	public void addBooking(BookingModel bm) {
		
		/*
		 * Iterator<BookingModel> b = bookings.iterator();
		 * 
		 * while(b.hasNext()) { BookingModel tempBooking = b.next();
		 * 
		 * if(tempBooking.getDate() == bm.getDate() && tempBooking.getTime() ==
		 * bm.getTime()) { System.out.println("E deja un booking gen"); }else {
		 * bookings.add(tempBooking); } }
		 */
		
		bookings.add(bm);
	
	}
	
	
	public List<BookingModel> getBookingsByTerenId(int id){
		
		List<BookingModel> tempBookings = new ArrayList<BookingModel>();
		
		for(BookingModel b: bookings) {
			if(b.getTeren().getId() == id) {
				tempBookings.add(b);
			}
		}
		
		return tempBookings;
	}
}
