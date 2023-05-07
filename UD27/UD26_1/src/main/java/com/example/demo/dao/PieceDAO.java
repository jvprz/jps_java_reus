package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Piece;

public interface PieceDAO extends JpaRepository<Piece, Long> {}