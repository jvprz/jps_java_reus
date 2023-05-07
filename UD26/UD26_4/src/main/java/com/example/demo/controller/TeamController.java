package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Team;
import com.example.demo.service.TeamService;

@RestController
@RequestMapping("/api")
public class TeamController {

	@Autowired
	TeamService teamService;
	
	@GetMapping("/team")
	public List<Team> listTeams() {
		return teamService.listTeams();
	}
	
	@GetMapping("/team/{id}")
	public Team teamById(@PathVariable(name = "id") String id) {
		return teamService.teamById(id);
	}
	
	@PostMapping("/team")
	public Team saveTeam(@RequestBody Team team) {
		return teamService.saveTeam(team);
	}
	
	@PutMapping("/team/{id}")
	public Team updateTeam(@PathVariable(name = "id") String id, @RequestBody Team team) {
		Team selectedTeam = new Team(id, team.getName(), team.getFaculty());
		return teamService.updateTeam(selectedTeam);
	}
	
	@DeleteMapping("/team/{id}")
	public void deleteTeam(@PathVariable(name = "id") String id) {
		teamService.deleteTeam(id);
	}
}
