package com.xworkz.carcompany;

import java.util.List;

import com.xworkz.carcompany.dto.CarCompanyDto;
import com.xworkz.carcompany.service.CarCompanyService;
import com.xworkz.carcompany.service.CarCompanyServiceImpl;

public class CarRunner {

	public static void main(String[] args) {

		CarCompanyDto dto = new CarCompanyDto(1, "CadiliacCompany", "Cadiliac", 200, 20, "Hyderabad",
				"Cadiliac123@gmail.com");
		CarCompanyDto dto1 = new CarCompanyDto(2, "AlfaRomeoCompany", "AlfaRomeo", 200, 25, "Banglore",
				"AlfaRomeo456@gmail.com");
		CarCompanyDto dto2 = new CarCompanyDto(3, "ToyotoCompany", "Toyoto", 250, 30, "Pune", "Toyoto@gmail.com");
		CarCompanyDto dto3 = new CarCompanyDto(4, "ChevroletCompany", "Chevrolet", 300, 35, "Maharashtra",
				"Chevrolet6788@gmail.com");
		CarCompanyDto dto4 = new CarCompanyDto(5, "MazdaComapny", "Mazda", 350, 40, "Delhi", "Mazda9876@gmail.com");
		CarCompanyDto dto5 = new CarCompanyDto(6, "SkodaComapny", "Skoda", 400, 45, "Manglore", "Mazda8777@gmail.com");

		CarCompanyService service = new CarCompanyServiceImpl();

//	boolean save5 =	service.save(dto5);
//	System.out.println(save5);
//	boolean save1 =	service.save(dto1);
//	System.out.println(save1);
//	boolean save2 =	service.save(dto2);
//	System.out.println(save2);
//	boolean save3 =	service.save(dto3);
//	System.out.println(save3);
//	boolean save4 =	service.save(dto4);
//	System.out.println(save4);

		CarCompanyDto foundedDto = service.findById(1);
		System.out.println(foundedDto);

		System.out.println("=================================================================");

		CarCompanyDto foundedDto1 = service.findBYName("'SkodaComapny'");
		System.out.println(foundedDto1);

		System.out.println("=================================================================");

		boolean updated = service.updateBYId(2, "RenaultCompany");
		System.out.println(updated);

		System.out.println("=================================================================");

		boolean update = service.updateBYIdAndName(5, "'MazdaComapny'", "Mini");
		System.out.println(update);

		System.out.println("=================================================================");

		boolean dlt = service.deleteById(3);
		System.out.println(dlt);

		System.out.println("=================================================================");
		List<CarCompanyDto> list = service.readAll();

		for (CarCompanyDto li : list) {
			System.out.println(li);
		}

	}

}
