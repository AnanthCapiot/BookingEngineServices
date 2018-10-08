package com.capiot.logistics.travel.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capiot.logistics.travel.model.BasicSearchCriteria;
import com.capiot.logistics.travel.model.Booking;

@RestController
//@RequestMapping("/bookings")
public class BookingController {
	
	//@GetMapping( value = "/" )
	@RequestMapping(value = "/bookings", method = RequestMethod.GET)
	public List<Booking> getAllBookings() {
		// call getAllBookings() with results count of 10, startIndex of 1
		return null;
	}	
	
	//@PostMapping( value = "/" )
	@RequestMapping(value = "/bookings/search", method = RequestMethod.POST)
	public List<Booking> getAllBookings( @RequestBody BasicSearchCriteria filter )	{
		return null;
	}
	
	@RequestMapping(value = "/bookings", method = RequestMethod.POST) 
	public Booking createBooking( @RequestBody Booking newBooking )	{
		// create new Booking, return Booking with generated ID
		return newBooking;
	}
	
	@GetMapping( value="/bookings/{id}" )
	public Booking getBooking( @PathVariable String id ) {
		try {
			return null;
		}
		catch( Exception e )	{
			// technically throw BookingNotFoundException
			return null;
		}
	}
	
	// Replace a Booking!
	@PutMapping("/bookings/id}")	
	public void updateBooking( @RequestBody Booking aBooking, @PathVariable String id  )	{
		
	}
}