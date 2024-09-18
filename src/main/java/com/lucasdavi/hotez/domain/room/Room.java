package com.lucasdavi.hotez.domain.room;

import com.lucasdavi.hotez.domain.hotel.Hotel;
import com.lucasdavi.hotez.enums.RoomType;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "room")
@Entity
public class Room {
    @Id
    @GeneratedValue
    private UUID id;
    private Integer number;
    private RoomType type;
    private Double pricePerNight;
    private Boolean avaliable;
    @OneToMany
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private Hotel hotel;
}
