package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.*;

public class ArticuloService {
	
	@Autowired
	IArticuloDAO iArticuloDAO;
	
	public List<Articulo> listArticles() {
		return iArticuloDAO.findAll();
	}
	
	public Articulo saveArticle(Articulo article) {
		return iArticuloDAO.save(article);
	}
	
	public Articulo articleById(Long id) {
		return iArticuloDAO.findById(id).get();
	}
	
	public List<Articulo> listArticleMaker(Fabricante maker) {
		return iArticuloDAO.findByMaker(maker);
	}
	
	public Articulo updateArticle(Articulo article) {
		return iArticuloDAO.save(article);
	}
	
	public void deleteArticle(Long id) {
		iArticuloDAO.deleteById(id);
	}

}
