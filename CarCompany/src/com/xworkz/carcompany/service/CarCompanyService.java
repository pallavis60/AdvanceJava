package com.xworkz.carcompany.service;

import java.util.List;

import com.xworkz.carcompany.dto.CarCompanyDto;

public interface CarCompanyService {
	
	public boolean save(CarCompanyDto dto);
	
	public List<CarCompanyDto> readAll();
	
	public CarCompanyDto findById(int id);
	
	public CarCompanyDto findBYName(String name);
	
	public boolean updateBYId(int id,String name);
	
	public boolean updateBYIdAndName(int id,String name,String brand);
	
	public boolean deleteById(int id);

}

