package com.example.hotel_booking_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity representing a Hotel.
 */
@Entity
public class Hotel {

    // Primary key with auto-generated value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String roomType;
    private String boardType;

    // Default constructor required by JPA
    public Hotel() {
    }

    /**
     * Constructor to create a new Hotel instance.
     *
     * @param name      the name of the hotel
     * @param roomType  the type of rooms available in the hotel
     * @param boardType the type of board available in the hotel
     */
    public Hotel(String name, String roomType, String boardType) {
        this.name = name;
        this.roomType = roomType;
        this.boardType = boardType;
    }

    // Getters and setters

    /**
     * Gets the ID of the hotel.
     *
     * @return the hotel ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the hotel.
     *
     * @param id the hotel ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the hotel.
     *
     * @return the hotel name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel.
     *
     * @param name the hotel name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the type of rooms available in the hotel.
     *
     * @return the room type
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the type of rooms available in the hotel.
     *
     * @param roomType the room type
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * Gets the type of board available in the hotel.
     *
     * @return the board type
     */
    public String getBoardType() {
        return boardType;
    }

    /**
     * Sets the type of board available in the hotel.
     *
     * @param boardType the board type
     */
    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }
}
