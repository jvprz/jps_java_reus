package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeamDAO;
import com.example.demo.dto.Team;

@Service
public class TeamService {

	@Autowired
	TeamDAO teamDAO;
	
	// CRUD
	public List<Team> listTeams() {
		return teamDAO.findAll();
	}
	
	public Team saveTeam(Team team) {
		return teamDAO.save(team);
	}
	
	public Team teamById(String id) {
		return teamDAO.findById(id).get();
	}
	
	public Team updateTeam(Team team) {
		return teamDAO.save(team);
	}
	
	public void deleteTeam(String id) {
		teamDAO.deleteById(id);
	}
}
