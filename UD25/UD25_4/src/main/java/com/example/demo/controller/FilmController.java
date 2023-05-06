package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Film;
import com.example.demo.service.FilmService;

@RestController
@RequestMapping("/api")
public class FilmController {

	@Autowired
	FilmService filmService;
	
	@GetMapping("/films")
	public List<Film> listFilms() {
		return filmService.listFilms();
	}
	
	@GetMapping("/films/{id}")
	public Film filmById(@PathVariable(name = "id") Long id) {
		Film filmById = new Film();
		filmById = filmService.FilmById(id);
		return filmById;
	}
	
	@PostMapping("/films")
	public Film saveFilm(@RequestBody Film film) {
		return filmService.saveFilm(film);
	}
	
	@PutMapping("/films/{id}")
	public Film updateFilm(@PathVariable(name = "id") Long id, @RequestBody Film film) {
		Film selectedFilm = new Film(id, film.getName(), film.getAge());
		Film updatedFilm = new Film();
		updatedFilm = filmService.updateFilm(selectedFilm);
		return updatedFilm;
	}
	
	@DeleteMapping("/films/{id}")
	public void deleteFilm(@PathVariable(name = "id") Long id) {
		filmService.deleteFilm(id);
	}
}
