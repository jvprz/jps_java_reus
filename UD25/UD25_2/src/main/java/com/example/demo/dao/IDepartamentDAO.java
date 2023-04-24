package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Departament;

public interface IDepartamentDAO extends JpaRepository<Departament, Long>{}