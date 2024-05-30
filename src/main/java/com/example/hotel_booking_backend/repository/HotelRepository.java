package com.example.hotel_booking_backend.repository;

import com.example.hotel_booking_backend.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
