package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Booking;
import com.example.demo.service.BookingService;

@RestController
@RequestMapping("/api")
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@GetMapping("/booking")
	public List<Booking> listBookings() {
		return bookingService.listBookings();
	}
	
	@GetMapping("/booking/{id}")
	public Booking bookingById(@PathVariable(name = "id") Long id) {
		return bookingService.bookingById(id);
	}
	
	@PostMapping("/booking")
	public Booking saveBooking(@RequestBody Booking booking) {
		return bookingService.saveBooking(booking);
	}
	
	@PutMapping("/booking/{id}")
	public Booking updateBooking(@PathVariable(name = "id") Long id, @RequestBody Booking booking) {
		Booking selectedBooking = new Booking(id, booking.getTeam(), booking.getInvestigator(), booking.getStart(), booking.getEnd());
		return bookingService.updateBooking(selectedBooking);
	}
	
	@DeleteMapping("/booking/{id}")
	public void deleteBooking(@PathVariable(name = "id") Long id) {
		bookingService.deleteBooking(id);
	}
}
