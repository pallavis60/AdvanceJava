package com.xworkz.foodDelivery.repository;

import com.xworkz.foodDelivery.dto.FoodDto;

public interface FoodRepository {
	
	public boolean save(FoodDto dto);

}
