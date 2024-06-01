package com.example.hotel_booking_backend.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class HotelDataService {

    public List<String> getAllHotelNames() {
        return Arrays.asList("Hotel A", "Hotel B", "Hotel C");
    }

    public List<String> getAllRoomTypes() {
        return Arrays.asList("Single", "Double", "Suite");
    }

    public List<String> getAllBoardTypes() {
        return Arrays.asList("Bed and Breakfast", "Half Board", "Full Board");
    }
}
