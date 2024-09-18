package com.lucasdavi.hotez.domain.reserve;

import com.lucasdavi.hotez.domain.room.Room;
import com.lucasdavi.hotez.enums.ReserveStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Table(name = "reserve")
@Entity
public class Reserve {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double totalPrice;
    private ReserveStatus status;
    @ManyToOne
    @JoinColumn(name = "room_id", referencedColumnName = "id")
    private Room room;

    /*
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @OneToOne(mappedBy = "reservation")
    private Payment payment;
    */
}
