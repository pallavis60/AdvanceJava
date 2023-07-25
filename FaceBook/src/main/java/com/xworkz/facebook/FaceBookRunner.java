package com.xworkz.facebook;

import java.util.List;

import com.xworkz.facebook.dto.FaceBookDto;
import com.xworkz.facebook.service.FaceBookService;
import com.xworkz.facebook.service.FaceBookServiceImpl;

public class FaceBookRunner {

	public static void main(String[] args) {

		FaceBookDto dto = new FaceBookDto(1, "Sheela", "sheela123@gmail.com", "sheela34555", "Belagavi", 23);
		FaceBookDto dto1 = new FaceBookDto(2, "Nikitha", "nikki6778@gmail.com", "nikki567777", "Shivamogga", 22);
		FaceBookDto dto2 = new FaceBookDto(3, "Gowri", "gowri@gmail.com", "gowramma87666", "Mandya", 26);
		FaceBookDto dto3 = new FaceBookDto(4, "Maha", "maha566688@gmail.com", "mahalakshmi456", "Tamilnadu", 25);
		FaceBookDto dto4 = new FaceBookDto(5, "Ashwini", "ashu5677@gmail.com", "ashwkkk5788", "Bagalkote", 28);

		FaceBookService service = new FaceBookServiceImpl();

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		boolean save=service.save(dto4);
//		System.out.println(save);

		FaceBookDto foundedDto = service.findById(1);
		System.out.println(foundedDto);

		System.out.println("============================================================");

		FaceBookDto findedDto = service.findByName("'Sheela'");
		System.out.println(findedDto);

		System.out.println("============================================================");
		boolean result = service.updateById(4, "Mahalakshmi");
		System.out.println(result);

		System.out.println("============================================================");

		boolean update = service.updateByNameAndId("'Ashwini'", 5, "ash123ashwini@gmail.com");
		System.out.println(update);

		System.out.println("============================================================");

		boolean dlt = service.deleteById(3);
		System.out.println(dlt);

		System.out.println("============================================================");

		List<FaceBookDto> dtos = service.readAll();

		for (FaceBookDto li : dtos) {
			System.out.println(li);
		}

	}

}
