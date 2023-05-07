package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookingDAO;
import com.example.demo.dto.Booking;

@Service
public class BookingService {

	@Autowired
	BookingDAO bookingDAO;
	
	// CRUD
	public List<Booking> listBookings() {
		return bookingDAO.findAll();
	}
	
	public Booking saveBooking(Booking booking) {
		return bookingDAO.save(booking);
	}
	
	public Booking bookingById(Long id) {
		return bookingDAO.findById(id).get();
	}
	
	public Booking updateBooking(Booking booking) {
		return bookingDAO.save(booking);
	}
	
	public void deleteBooking(Long id) {
		bookingDAO.deleteById(id);
	}
}
