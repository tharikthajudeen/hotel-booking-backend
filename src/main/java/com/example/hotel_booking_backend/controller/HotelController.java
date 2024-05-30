package com.example.hotel_booking_backend.controller;

import com.example.hotel_booking_backend.model.Hotel;
import com.example.hotel_booking_backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;


import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
        Hotel savedHotel = hotelService.saveHotel(hotel);
        return ResponseEntity.ok(savedHotel);
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> getAllHotelNames() {
        List<String> hotelNames = Arrays.asList("Hotel A", "Hotel B", "Hotel C");
        return ResponseEntity.ok(hotelNames);
    }

    @GetMapping("/room-types")
    public ResponseEntity<List<String>> getAllRoomTypes() {
        List<String> roomTypes = Arrays.asList("Single", "Double", "Suite");
        return ResponseEntity.ok(roomTypes);
    }

    @GetMapping("/board-types")
    public ResponseEntity<List<String>> getAllBoardTypes() {
        List<String> boardTypes = Arrays.asList("Bed and Breakfast", "Half Board", "Full Board");
        return ResponseEntity.ok(boardTypes);
    }
}
