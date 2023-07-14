package com.xworkz.yoga.service;

import com.xworkz.yoga.dto.YogaDto;

public interface YogaService {
	
	public boolean save(YogaDto dto);
	
	public boolean findByName(String name);

}
