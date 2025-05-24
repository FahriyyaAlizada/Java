package com.example.Car_rental_system.dto;

public class CarResponseDto {
	
	private Integer id;
	private String brand;
	private String model;
	private Integer year;
	
	public CarResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public CarResponseDto(Integer id, String brand, String model, Integer year) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

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
