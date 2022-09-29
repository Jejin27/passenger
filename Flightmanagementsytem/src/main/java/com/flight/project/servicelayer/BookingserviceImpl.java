package com.flight.project.servicelayer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.Bookingrepo;
import com.flight.project.dto.Booking;
import com.flight.project.exception.Resourcebook;
@Service
public class BookingserviceImpl implements Bookingservice{
	//dI
	@Autowired
	private Bookingrepo bookrepo;

	public BookingserviceImpl(Bookingrepo bookrepo) {
		super();
		this.bookrepo = bookrepo;
	}

	@Override
	public Booking saveBooking(Booking bk) {
		return bookrepo.save(bk);
	}

	@Override
	public List<Booking> getAllBooking() {
		return bookrepo.findAll();
	}

	@Override
	public Booking updateBooking(Booking bk, long id) {
	    Booking bkex=bookrepo.findById(id).orElseThrow(()->
	    new Resourcebook("Booking","Id",id));
	   
	    bkex.setUserId(bk.getUserId());
	    bkex.setBookingDate(bk.getBookingDate());
	    bkex.setPassengerList(bk.getPassengerList());
	    bkex.setNoofpassengers(bk.getNoofpassengers());
	    bkex.setTicketCost(bk.getTicketCost());
	    bkex.setFlightname(bk.getFlightname());
	    bookrepo.save(bkex);
	    
		return bkex;
	}

	@Override
	public void deleteBooking(long id) {
		  bookrepo.findById(id).orElseThrow( ()->
	        new Resourcebook("Employee","Id",id));
	        bookrepo.deleteById(id);
	    }
		
	}

	


