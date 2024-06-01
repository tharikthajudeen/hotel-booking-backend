package com.example.hotel_booking_backend.controller;

import com.example.hotel_booking_backend.model.Hotel;
import com.example.hotel_booking_backend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * REST controller for managing Hotel entities.
 * Provides endpoints for common hotel operations.
 */
@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    private final HotelService hotelService;

    /**
     * Constructor for HotelController, with dependency injection of HotelService.
     *
     * @param hotelService the service to be injected
     */
    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    /**
     * Retrieves a list of all hotels.
     *
     * @return a list of Hotel entities
     */
    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    /**
     * Saves a new hotel or updates an existing one.
     *
     * @param hotel the Hotel entity to be saved
     * @return a ResponseEntity containing the saved Hotel entity
     */
    @PostMapping
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
        Hotel savedHotel = hotelService.saveHotel(hotel);
        return ResponseEntity.ok(savedHotel);
    }

    /**
     * Retrieves a list of all hotel names.
     *
     * @return a ResponseEntity containing a list of hotel names
     */
    @GetMapping("/names")
    public ResponseEntity<List<String>> getAllHotelNames() {
        List<String> hotelNames = Arrays.asList("Hotel A", "Hotel B", "Hotel C");
        return ResponseEntity.ok(hotelNames);
    }

    /**
     * Retrieves a list of all room types.
     *
     * @return a ResponseEntity containing a list of room types
     */
    @GetMapping("/room-types")
    public ResponseEntity<List<String>> getAllRoomTypes() {
        List<String> roomTypes = Arrays.asList("Single", "Double", "Suite");
        return ResponseEntity.ok(roomTypes);
    }

    /**
     * Retrieves a list of all board types.
     *
     * @return a ResponseEntity containing a list of board types
     */
    @GetMapping("/board-types")
    public ResponseEntity<List<String>> getAllBoardTypes() {
        List<String> boardTypes = Arrays.asList("Bed and Breakfast", "Half Board", "Full Board");
        return ResponseEntity.ok(boardTypes);
    }
}
