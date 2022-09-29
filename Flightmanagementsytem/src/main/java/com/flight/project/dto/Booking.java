package com.flight.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	  @Column (name="useId")
	    private int userId ;
	    @Column (name="boDate")
	    private String bookingDate ;
	    @Column (name="passList")
	    private long passengerList;
	    @Column (name="tiCost")
	    private double ticketCost;
	    @Column (name="npass")
	    private int noofpassengers;
	    @Column (name="flightname")
	    private String flightname;
		public Booking(int bookingId, int userId, String bookingDate, long passengerList, double ticketCost,
				int noofpassengers, String flightname) {
			super();
			this.bookingId = bookingId;
			this.userId = userId;
			this.bookingDate = bookingDate;
			this.passengerList = passengerList;
			this.ticketCost = ticketCost;
			this.noofpassengers = noofpassengers;
			this.flightname = flightname;
		}
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getBookingId() {
			return bookingId;
		}
		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getBookingDate() {
			return bookingDate;
		}
		public void setBookingDate(String bookingDate) {
			this.bookingDate = bookingDate;
		}
		public long getPassengerList() {
			return passengerList;
		}
		public void setPassengerList(long passengerList) {
			this.passengerList = passengerList;
		}
		public double getTicketCost() {
			return ticketCost;
		}
		public void setTicketCost(double ticketCost) {
			this.ticketCost = ticketCost;
		}
		public int getNoofpassengers() {
			return noofpassengers;
		}
		public void setNoofpassengers(int noofpassengers) {
			this.noofpassengers = noofpassengers;
		}
		public String getFlightname() {
			return flightname;
		}
		public void setFlightname(String flightname) {
			this.flightname = flightname;
		}
	
	

}
