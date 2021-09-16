package com.dio.santanderfullstack.roomscheduleapi.controller;

import com.dio.santanderfullstack.roomscheduleapi.exception.ResourceNotFoundException;
import com.dio.santanderfullstack.roomscheduleapi.model.Room;
import com.dio.santanderfullstack.roomscheduleapi.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController 
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/rooms")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoomController {

    private final RoomRepository roomRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room create(@RequestBody @Valid Room room) {
        return roomRepository.save(room);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room findById(@PathVariable Long id) throws ResourceNotFoundException {
        var room = roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found :: " + id));

        return room;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Room> listAll() {
        return roomRepository.findAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room update(@PathVariable Long id, @RequestBody @Valid Room room) throws ResourceNotFoundException {
        var roomToBeUpdated = roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found :: " + id));

        room.setId(id);
        return roomRepository.save(room);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws ResourceNotFoundException {
        var roomToBeDeleted = roomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found :: " + id));

        roomRepository.deleteById(id);
    }
}
