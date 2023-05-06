package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Cashier;

public interface CashierDAO extends JpaRepository<Cashier, Long>{}