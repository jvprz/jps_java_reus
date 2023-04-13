package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadosDAO;
import com.example.demo.dto.Empleados;

@Service
public class IEmpleadosServiceImpl implements IEmpleadosService {
	// Inicialize DAO
	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	@Override
	public List<Empleados> listEmpleados() {
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados saveEmpleados(Empleados empleados) {
		empleados.setSalario(empleados.getSalarioBase());
		return iEmpleadosDAO.save(empleados);
	}

	@Override
	public Empleados empleadosXId(Long id) {
		return iEmpleadosDAO.findById(id).get();
	}

	@Override
	public List<Empleados> listEmpleadosName(String nombre) {
		return iEmpleadosDAO.findByNombre(nombre);
	}

	@Override
	public Empleados updateEmpleados(Empleados empleados) {
		return iEmpleadosDAO.save(empleados);
	}

	@Override
	public void deleteEmpleados(Long id) {
		iEmpleadosDAO.deleteById(id);	
	};	
}
