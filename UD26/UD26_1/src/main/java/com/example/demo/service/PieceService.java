package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PieceDAO;
import com.example.demo.dto.Piece;

@Service
public class PieceService {
	
	@Autowired
	PieceDAO pieceDAO;
	
	// CRUD
	public List<Piece> listPieces() {
		return pieceDAO.findAll();
	}

	public Piece savePiece(Piece piece) {
		return pieceDAO.save(piece);
	}

	public Piece pieceById(Long id) {
		return pieceDAO.findById(id).get();
	}

	public Piece updatePiece(Piece piece) {
		return pieceDAO.save(piece);
	}

	public void deletePiece(Long id) {
		pieceDAO.deleteById(id);
	}
}
