package com.george.fieldfinder.FieldFinder.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.george.fieldfinder.FieldFinder.Model.BookingModel;
import com.george.fieldfinder.FieldFinder.Model.TerenModel;
import com.george.fieldfinder.FieldFinder.Service.BookingService;
import com.george.fieldfinder.FieldFinder.Service.TerenService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class TerenController {

	
	@Autowired
	private TerenService service;
	
	@Autowired
	private BookingService bservice;
	//private TerenModel tm;
	
	@GetMapping("/terenuri")
	public List<TerenModel> getAllTerenuri() {
		return service.getAll();
	}
	
	@GetMapping("/terenuri/{sector}/{sport}")
	public List<TerenModel> getTerenBySector(@PathVariable int sector, @PathVariable String sport){
		return service.getTerenBySector(sector, sport);
	}
	
	@GetMapping("teren/{id}")
	public TerenModel getTerenById(@PathVariable int id) {
		return service.getTerenById(id);
	}
	
	@GetMapping("/bookings")
	public List<BookingModel> getAllBookings(){
		return bservice.getAllBookings();
	}
	
	
	@RequestMapping(value = "/put", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void putBooking(@RequestBody BookingModel bm) {
		bservice.addBooking(bm);
	}
	
	@GetMapping("/bookings/{id}")
	public List<BookingModel> getBookingsByTeren(@PathVariable int id){
		return bservice.getBookingsByTerenId(id);
	}
	
}
