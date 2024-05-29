package com.example.hotel_booking_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {

    @GetMapping("/hotels")
    public List<String> getHotels() {
        return Arrays.asList("Hotel A", "Hotel B", "Hotel C");
    }

    @GetMapping("/roomTypes")
    public List<String> getRoomTypes() {
        return Arrays.asList("Single", "Double", "Suite");
    }

    @GetMapping("/boardTypes")
    public List<String> getBoardTypes() {
        return Arrays.asList("Half Board", "Full Board");
    }
}
