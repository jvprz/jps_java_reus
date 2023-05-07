package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Investigator;

public interface InvestigatorDAO extends JpaRepository<Investigator, String> {}