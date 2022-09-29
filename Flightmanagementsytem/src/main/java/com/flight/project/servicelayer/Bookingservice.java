package com.flight.project.servicelayer;

import java.util.List;

import com.flight.project.dto.Booking;

public interface Bookingservice {
	//save
	Booking saveBooking(Booking bk);
	
	//getall
	List<Booking> getAllBooking();
	
	//update
	Booking updateBooking(Booking bk,long id);
	
	//delete
	void deleteBooking(long id);
	

}
