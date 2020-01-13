package com.redbus.backend_redbus.repository;

import com.redbus.backend_redbus.model.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserTable,Integer> {
}
