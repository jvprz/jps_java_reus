package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Empleados;

/**
 * @author Javier
 *
 */
public interface IEmpleadosDAO extends JpaRepository<Empleados, Long>{

	// List "empleados" by name
	public List<Empleados> findByNombre(String nombre);
}
