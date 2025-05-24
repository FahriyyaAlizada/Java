package com.example.Car_rental_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Car_rental_system.dto.CarRequestDto;
import com.example.Car_rental_system.dto.CarResponseDto;
import com.example.Car_rental_system.entity.Car;
import com.example.Car_rental_system.exception.OurRuntimeException;
import com.example.Car_rental_system.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> getCars() {
        return carRepository.findAll();
    }

    public void addCar(CarRequestDto dto) {
        Car c = new Car();
        c.setId(null);
        c.setBrand(dto.getBrand());
        c.setModel(dto.getModel());
        c.setYear(dto.getYear());

        carRepository.save(c);
    }

    public void updateCar(CarRequestDto dto) {
        if (dto.getId() == null || dto.getId() <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Car> byId = carRepository.findById(dto.getId());
        if (byId.isPresent()) {
            Car car = byId.get();
            car.setBrand(dto.getBrand());
            car.setModel(dto.getModel());
            car.setYear(dto.getYear());
            carRepository.save(car);
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }

    public void deleteCar(Integer id) {
        if (id == null || id <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Car> byId = carRepository.findById(id);
        if (byId.isPresent()) {
            carRepository.deleteById(id);
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }

    public CarResponseDto getCarById(Integer id) {
        if (id == null || id <= 0) {
            throw new OurRuntimeException(null, "id is mandatory");
        }

        Optional<Car> byId = carRepository.findById(id);
        if (byId.isPresent()) {
            Car car = byId.get();
            CarResponseDto response = new CarResponseDto();
            response.setId(car.getId());
            response.setBrand(car.getBrand());
            response.setModel(car.getModel());
            response.setYear(car.getYear());
            return response;
        } else {
            throw new OurRuntimeException(null, "id cannot be found");
        }
    }
	
}
