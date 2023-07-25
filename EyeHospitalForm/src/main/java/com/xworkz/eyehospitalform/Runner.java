package com.xworkz.eyehospitalform;

import java.util.List;

import com.xworkz.eyehospitalform.dto.EyeHospitalFormDto;
import com.xworkz.eyehospitalform.service.EyeHopstServiceImpl;
import com.xworkz.eyehospitalform.service.EyeHosptService;

public class Runner {

	public static void main(String[] args) {

		EyeHospitalFormDto dto = new EyeHospitalFormDto(1, "Jayadev", "Sheela", 23, "Banglore", true);
		EyeHospitalFormDto dto1 = new EyeHospitalFormDto(2, "Asara", "Nikitha", 24, "Shivamogga", false);
		EyeHospitalFormDto dto2 = new EyeHospitalFormDto(3, "Meghan", "Gowri", 25, "Belagavi", true);
		EyeHospitalFormDto dto3 = new EyeHospitalFormDto(4, "Adarsha", "Ashwini", 26, "Dharvada", false);
		EyeHospitalFormDto dto4 = new EyeHospitalFormDto(5, "GuruHospt", "Ananya", 28, "Gulbarga", true);

		EyeHosptService service = new EyeHopstServiceImpl();
		// boolean result = service.save(dto);
		// boolean result1 = service.save(dto1);
		// boolean result2 = service.save(dto2);
		// boolean result3 = service.save(dto4);
		// System.out.println(result);
		// System.out.println(result2);
		// System.out.println(result3);
		// System.out.println(result1);

		System.out.println("-------------------------------------------------------------");

		EyeHospitalFormDto findedDto = service.findByPatientName("'Nikitha'");
		System.out.println(findedDto);

		System.out.println("==========================================");
		EyeHospitalFormDto finding = service.findById(1);
		System.out.println(finding);

		System.out.println("--------------------------------------------------------");

		boolean updated = service.updateHospitalNameByName("Nirmala", "'Ashwini'");
		System.out.println(updated);

		System.out.println("=============================================================");

		// boolean delete = service.deleteByAge(25);
		// System.out.println(delete);

		System.out.println("----------------------------------------------------");

		// boolean deleted = service.deleteByIdAndName(5, "'Ananya'");
		// System.out.println(deleted);

		System.out.println("=============================================================");

		boolean updatedDto = service.updateAgeAndisFirstvisitByHospitalName(20, true, "'Nirmala'");
		System.out.println(updatedDto);

		System.out.println("=============================================================");

		List<EyeHospitalFormDto> read = service.readAll();

		for (EyeHospitalFormDto list : read) {
			System.out.println(list);
		}

	}

}
