package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Project;

public interface ProjectDAO extends JpaRepository<Project, String> {}