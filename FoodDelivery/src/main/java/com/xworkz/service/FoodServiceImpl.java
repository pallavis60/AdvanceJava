package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.foodDelivery.dto.FoodDto;
import com.xworkz.foodDelivery.repository.FoodRepository;
import com.xworkz.foodDelivery.repository.FoodRepositoryImpl;

public class FoodServiceImpl implements  FoodService{
	
	
	
	FoodRepository repo = new FoodRepositoryImpl();

	@Override
	public boolean save(FoodDto dto) {
	ValidatorFactory validate=Validation.buildDefaultValidatorFactory();
	Validator val=validate.getValidator();
	Set<ConstraintViolation<FoodDto>> violation=val.validate(dto);
	
	if(violation.isEmpty()) {
		System.out.println("no Violation");
		boolean save=repo.save(dto);
		System.out.println(save);
		
		
	}else {
		System.out.println("violation");
		System.out.println(violation);
	}
	return false;
	}
	
	
}
	
	
		
	

	

