package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Room;
import com.example.demo.service.RoomService;

@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	@GetMapping("/rooms")
	public List<Room> listRooms() {
		return roomService.listRooms();
	}
	
	@GetMapping("/rooms/{id}")
	public Room roomById(@PathVariable(name = "id") Long id) {
		Room roomById = new Room();
		roomById = roomService.roomById(id);
		return roomById;
	}
	
	@PostMapping("/rooms")
	public Room saveRoom(@RequestBody Room room) {
		return roomService.saveRoom(room);
	}
	
	@PutMapping("/rooms/{id}")
	public Room updateRoom(@PathVariable(name = "id") Long id, @RequestBody Room room) {
		Room selectedRoom = new Room(id, room.getName(), room.getFilm());
		Room updatedRoom = new Room();
		selectedRoom = roomService.updateRoom(selectedRoom);
		return updatedRoom;
	}
	
	@DeleteMapping("/rooms/{id}")
	public void deleteRoom(@PathVariable(name = "id") Long id) {
		roomService.deleteRoom(id);
	}
}
