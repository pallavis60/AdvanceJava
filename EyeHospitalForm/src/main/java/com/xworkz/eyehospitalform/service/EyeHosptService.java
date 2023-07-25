package com.xworkz.eyehospitalform.service;

import java.util.List;

import com.xworkz.eyehospitalform.dto.EyeHospitalFormDto;

public interface EyeHosptService {
	
	public boolean save(EyeHospitalFormDto dto);
	
	public List<EyeHospitalFormDto> readAll();
	
	public EyeHospitalFormDto findByPatientName(String name);
	
	public EyeHospitalFormDto findById(int id);
	
	public boolean updateHospitalNameByName(String hosptName,String name);
	
	public boolean deleteByAge(int age);
	
	public boolean deleteByIdAndName(int id,String name);
	
	public boolean updateAgeAndisFirstvisitByHospitalName(int age, boolean isFirstvisit,String hosptName);

}
