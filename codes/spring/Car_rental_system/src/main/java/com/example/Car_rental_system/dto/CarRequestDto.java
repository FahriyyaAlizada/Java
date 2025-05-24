package com.example.Car_rental_system.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CarRequestDto {
	
	private Integer id;
	@Size(min=2, max=40, message="brand should be between 2-40 symbols...")
	@NotEmpty
	private String brand;
	@Size(min=2, max=40, message="model should be between 2-40 symbols...")
	@NotBlank
	private String model;
	@NotNull(message = "year cannot be null...")
	@Min(value = 1900, message = "year can be min 1900...")
	@Max(value = 2025, message = "year can be max 2025...")
	private Integer year;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
}
