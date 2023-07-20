package com.xworkz.medicine;

import java.util.List;

import com.xworkz.medicine.dto.MedicineDto;
import com.xworkz.medicine.service.MedicineService;
import com.xworkz.medicine.service.MedicineServiceImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		
		MedicineDto dto = new MedicineDto(1,"Alprazolam","anxietyAndPanicDisorder",500,"benzodiazepine","tiredness");
		MedicineDto dto1 = new MedicineDto(2,"Amlodipine","highBloodPressure",1000,"dicarboxylate","headache");
		MedicineDto dto2= new MedicineDto(3,"Aripiprazole","Tourette Syndrome",2000,"dihydrocarbostyil","Indigestion");
		
		MedicineService service = new MedicineServiceImpl();
//		boolean save=service.save(dto1);
//		System.out.println(save);
//		
//		boolean save1=service.save(dto2);
//		System.out.println(save1);
//		
		
		MedicineDto list = service.findByName("'Amlodipine'");
		System.out.println(list);
		
		//boolean update =service.updateusedForByName("'Aripiprazole'", "depressive Disorder");
		//System.out.println(update);
		
	    // boolean updating =	service.updateNameAndIdBysideEffect("Paracetamol", 6000, "'tiredness'");
	 //    System.out.println(updating);
	     
	       List<MedicineDto> read =service.readAll();
	       
	       read.forEach((n)->System.out.println(n));
		
		
		
		
		
	}

}
