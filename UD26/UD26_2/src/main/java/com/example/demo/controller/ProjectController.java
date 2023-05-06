package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Project;
import com.example.demo.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@GetMapping("/projects")
	public List<Project> listProjects() {
		return projectService.listProjects();
	}
	
	@GetMapping("/projects/{id}")
	public Project projectById(@PathVariable(name = "id") String id) {
		Project projectxId = new Project();
		projectxId = projectService.projectById(id);
		return projectxId;
	}
	
	@PostMapping("/projects")
	public Project saveProjects(@PathVariable(name = "id") String id, @RequestBody Project project) {
		return projectService.saveProject(project);
	}
	
	@PutMapping("/projects/{id}")
	public Project updateProject(@PathVariable(name = "id") String id, @RequestBody Project project) {
		Project selectedProject = new Project(id, project.getName(), project.getHours());
		Project updatedProject = new Project();
		updatedProject = projectService.updateProject(selectedProject);
		return updatedProject;
	}
	
	@DeleteMapping("/projects/{id}")
	public void deleteProject(@PathVariable(name = "id") String id) {
		projectService.deleteProject(id);
	}
}
