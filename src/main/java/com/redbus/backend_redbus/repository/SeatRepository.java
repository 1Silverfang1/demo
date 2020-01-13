package com.redbus.backend_redbus.repository;

import com.redbus.backend_redbus.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Integer> {
}
