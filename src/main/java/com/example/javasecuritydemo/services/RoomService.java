package com.example.javasecuritydemo.services;


import com.example.javasecuritydemo.models.Room;
import com.example.javasecuritydemo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
    public void add_Room(Room book){
        roomRepository.save(book);
    }


}
