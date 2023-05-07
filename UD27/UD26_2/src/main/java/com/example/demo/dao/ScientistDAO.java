package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Scientist;

public interface ScientistDAO extends JpaRepository<Scientist, String>{}