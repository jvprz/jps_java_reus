package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Booking;

public interface BookingDAO extends JpaRepository<Booking, Long> {}