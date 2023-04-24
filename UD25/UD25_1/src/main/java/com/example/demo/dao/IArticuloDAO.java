package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.*;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

	public List<Articulo> findByMaker(Fabricante maker);
	
}
