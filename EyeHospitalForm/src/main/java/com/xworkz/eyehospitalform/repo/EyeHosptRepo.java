package com.xworkz.eyehospitalform.repo;

import java.util.List;

import com.xworkz.eyehospitalform.dto.EyeHospitalFormDto;

public interface EyeHosptRepo {

public	boolean save(EyeHospitalFormDto dto);

public List<EyeHospitalFormDto> readAll();

public EyeHospitalFormDto findByPatientName(String name);

public EyeHospitalFormDto findById(int id);

public boolean updateHospitalNameByName(String hosptName, String name);

public boolean deleteByAge(int age);

public boolean deleteByIdAndName(int id, String patName);

public boolean updateAgeAndisFirstvisitByHospitalName(int age, boolean isFirstvisit,String hosptName);



}
