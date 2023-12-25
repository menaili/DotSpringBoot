package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // You can add custom query methods here if needed
}
