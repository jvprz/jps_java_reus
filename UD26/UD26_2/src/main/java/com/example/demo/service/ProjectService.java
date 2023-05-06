package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProjectDAO;
import com.example.demo.dto.Project;

@Service
public class ProjectService {
	
	@Autowired
	ProjectDAO projectDAO;
	
	// CRUD
	public List<Project> listProjects() {
		return projectDAO.findAll();
	}
	
	public Project saveProject(Project project) {
		return projectDAO.save(project);
	}
	
	public Project projectById(String id) {
		return projectDAO.findById(id).get();
	}
	
	public Project updateProject(Project project) {
		return projectDAO.save(project);
	}
	
	public void deleteProject(String id) {
		projectDAO.deleteById(id);
	}
}
