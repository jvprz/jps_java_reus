package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Team;

public interface TeamDAO extends JpaRepository<Team, String> {}