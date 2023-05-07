package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Piece;
import com.example.demo.service.PieceService;

@RestController
@RequestMapping("/api")
public class PieceController {

	@Autowired
	PieceService pieceService;
	
	@GetMapping("/pieces")
	public List<Piece> listPiezas() {
		return pieceService.listPieces();
	}
	
	@GetMapping("/pieces/{id}")
	public Piece piecesById(@PathVariable(name = "id") Long id) {
		Piece piecesxID = new Piece();
		piecesxID = pieceService.pieceById(id);
		return piecesxID;
	}
	
	@PostMapping("/pieces")
	public Piece savePiece(@RequestBody Piece piece) {
		return pieceService.savePiece(piece);
	}
	
	@PutMapping("/pieces/{id}")
	public Piece updatePiece(@PathVariable(name = "id") Long id, @RequestBody Piece piece) {
		Piece selectedPiece = new Piece(id, piece.getName());
		Piece updatedPiece = new Piece();
		updatedPiece = pieceService.updatePiece(selectedPiece);
		return updatedPiece;
	}
	
	@DeleteMapping("/pieces/{id}")
	public void deletePiece(@PathVariable(name = "id") Long id) {
		pieceService.deletePiece(id);
	}
}
