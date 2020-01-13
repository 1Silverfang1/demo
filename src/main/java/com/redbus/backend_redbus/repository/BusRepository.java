package com.redbus.backend_redbus.repository;

import com.redbus.backend_redbus.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Integer> {
}
