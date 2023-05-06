package com.example.demo.dao;

import org.hibernate.id.Assigned;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignedDAO extends JpaRepository<Assigned, Long> {}