package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Film;

public interface FilmDAO extends JpaRepository<Film, Long> {}