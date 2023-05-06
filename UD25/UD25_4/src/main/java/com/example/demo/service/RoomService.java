package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RoomDAO;
import com.example.demo.dto.Room;

@Service
public class RoomService {

	@Autowired
	RoomDAO roomDAO;
	
	// CRUD
	public List<Room> listRooms() {
		return roomDAO.findAll();
	}
	
	public Room saveRoom(Room room) {
		return roomDAO.save(room);
	}
	
	public Room roomById(Long id) {
		return roomDAO.findById(id).get();
	}
	
	public Room updateRoom(Room room) {
		return roomDAO.save(room);
	}
	
	public void deleteRoom(Long id) {
		roomDAO.deleteById(id);
	}
}
