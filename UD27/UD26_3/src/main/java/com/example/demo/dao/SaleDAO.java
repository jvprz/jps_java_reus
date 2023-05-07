package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Sale;

public interface SaleDAO extends JpaRepository<Sale, Long> {}