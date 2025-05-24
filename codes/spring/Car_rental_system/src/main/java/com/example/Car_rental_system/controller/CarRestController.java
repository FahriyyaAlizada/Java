package com.example.Car_rental_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Car_rental_system.dto.CarRequestDto;
import com.example.Car_rental_system.dto.CarResponseDto;
import com.example.Car_rental_system.entity.Car;
import com.example.Car_rental_system.exception.OurRuntimeException;
import com.example.Car_rental_system.service.CarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path="/api/car")
public class CarRestController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping(path = "/add")
    public void addCar(@Valid @RequestBody CarRequestDto dto, BindingResult br) {
        if (br.hasErrors()) {
            throw new OurRuntimeException(br, "error");
        }
        carService.addCar(dto);
    }

    @PutMapping(path = "/update")
    public void updateCar(@Valid @RequestBody CarRequestDto dto, BindingResult br) {
        if (br.hasErrors()) {
            throw new OurRuntimeException(br, "error");
        }
        carService.updateCar(dto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car deleted successfully");
    }

    @GetMapping(path = "/{id}")
    public CarResponseDto getCarById(@PathVariable Integer id) {
        return carService.getCarById(id);
    }
}
