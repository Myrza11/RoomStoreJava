package com.example.javasecuritydemo.controller;

import com.example.javasecuritydemo.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.*;
import com.example.javasecuritydemo.services.RoomService;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;
    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/all_rooms")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
    @PostMapping("/add_room")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void add_Room(@RequestBody Room room) {
        roomService.add_Room(room);
    }

    @GetMapping("/get")
    public String get() {
        return "Hello World";
    }

}
