package com.xworkz.yoga.repository;

import com.xworkz.yoga.dto.YogaDto;

public interface YogaRepository {

	public boolean save(YogaDto dto);

	public boolean findByName(String name);
}
