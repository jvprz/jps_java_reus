package com.example.demo.dao;

import com.example.demo.dto.Assigned;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignedDAO extends JpaRepository<Assigned, Long> {}