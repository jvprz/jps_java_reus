package com.example.demo.dto;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas")
public class Booking {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "equipo")
	private Team team;
	@ManyToOne
	@JoinColumn(name = "investigador")
	private Investigator investigator;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime start;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime end;

	// Constructors
	public Booking() {}

	public Booking(Long id, Team team, Investigator investigator, LocalDateTime start, LocalDateTime end) {
		this.id = id;
		this.team = team;
		this.investigator = investigator;
		this.start = start;
		this.end = end;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Team getTeam() {
		return team;
	}

	public Investigator getInvestigator() {
		return investigator;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void setInvestigator(Investigator investigator) {
		this.investigator = investigator;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
}
