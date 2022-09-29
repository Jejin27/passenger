package com.flight.project.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.project.dto.Booking;
import com.flight.project.servicelayer.Bookingservice;

@RestController
@RequestMapping("/api/booking")
public class Bookcontrol {
	//Di
	private Bookingservice bookser;
	//con

	public Bookcontrol(Bookingservice bookser) {
		super();
		this.bookser = bookser;
	}
	@PostMapping
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking book){
        return new ResponseEntity<Booking>
        (bookser.saveBooking(book),HttpStatus.CREATED);
	}
	@GetMapping
	public  List<Booking> getAllBooking(){
	 return bookser.getAllBooking();
	 }
	
	@PutMapping("{id}")
	public ResponseEntity<Booking> updateBooking(@PathVariable("id") long id, @RequestBody Booking bk) {
		return new ResponseEntity<Booking>(bookser.updateBooking(bk, id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteBooking(@PathVariable("id") long id) {

		bookser.deleteBooking(id);
		return new ResponseEntity<String>("Booking data deleted successfully", HttpStatus.OK);
	}
	

}
