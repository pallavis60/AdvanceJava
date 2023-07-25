package com.xworkz.facebook.repo;

import java.util.List;

import com.xworkz.facebook.dto.FaceBookDto;

public interface FaceBookRepo {
	
public boolean save(FaceBookDto dto);
	
	public List<FaceBookDto> readAll();
	
	public FaceBookDto findById(int id);
	
	public FaceBookDto findByName(String name);
	
	public boolean updateById(int id,String name);
	
	public boolean updateByNameAndId(String name,int id,String email);
	
	public boolean deleteById(int id);
	

}
