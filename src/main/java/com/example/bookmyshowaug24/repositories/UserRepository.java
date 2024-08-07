package com.example.bookmyshowaug24.repositories;

import com.example.bookmyshowaug24.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);
}
