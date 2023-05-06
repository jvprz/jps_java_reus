package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FilmDAO;
import com.example.demo.dto.Film;

@Service
public class FilmService {

	@Autowired
	FilmDAO filmDAO;
	
	// CRUD
	public List<Film> listFilms() {
		return filmDAO.findAll();
	}
	
	public Film saveFilm(Film film) {
		return filmDAO.save(film);
	}
	
	public Film FilmById(Long id) {
		return filmDAO.findById(id).get();
	}
	
	public Film updateFilm(Film film) {
		return filmDAO.save(film);
	}
	
	public void deleteFilm(Long id) {
		filmDAO.deleteById(id);
	}
}
