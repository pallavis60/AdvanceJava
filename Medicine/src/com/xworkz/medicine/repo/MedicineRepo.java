package com.xworkz.medicine.repo;

import java.util.List;

import com.xworkz.medicine.dto.MedicineDto;

public interface MedicineRepo {
	
	public boolean save(MedicineDto dto);
	
    public MedicineDto findByName(String name); 
    
    public boolean updateusedForByName(String name,String usedFor);
    
    
    public boolean updateNameAndIdBysideEffect(String name,int rate,String sideEffect);
    
    public List<MedicineDto> readAll();

}
