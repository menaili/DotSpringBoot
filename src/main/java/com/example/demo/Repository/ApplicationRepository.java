package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.api.model.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
