package com.example.hotel_booking_backend.service;

import com.example.hotel_booking_backend.model.Hotel;
import com.example.hotel_booking_backend.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer for managing Hotel entities.
 * This layer handles business logic and communication with the repository layer.
 */
@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    /**
     * Constructor for HotelService, with dependency injection of HotelRepository.
     *
     * @param hotelRepository the repository to be injected
     */
    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    /**
     * Retrieves all hotels from the repository.
     *
     * @return a list of all hotels
     */
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    /**
     * Saves a new hotel or updates an existing one in the repository.
     *
     * @param hotel the hotel entity to be saved
     * @return the saved hotel entity
     */
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
