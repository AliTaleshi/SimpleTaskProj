package com.example.SimpleProjTask.repository;

import com.example.SimpleProjTask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
