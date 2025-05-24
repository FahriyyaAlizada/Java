package com.example.Car_rental_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Car_rental_system.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
