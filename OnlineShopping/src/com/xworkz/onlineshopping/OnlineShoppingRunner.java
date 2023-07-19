package com.xworkz.onlineshopping;

import java.util.List;

import com.xworkz.onlineshoppingdto.OnlineShoppingDto;
import com.xworkz.onlineshoppingservice.OnlineShoppingService;
import com.xworkz.onlineshoppingservice.OnlineShoppingServiceImpl;

public class OnlineShoppingRunner {

	public static void main(String[] args) {

		OnlineShoppingDto dto = new OnlineShoppingDto(1, "Ramya", "book", 1, 200, "3 Stars");
		OnlineShoppingDto dto1 = new OnlineShoppingDto(2, "Maha", "Clock", 3, 2000, "4 Stars");
		OnlineShoppingDto dto2 = new OnlineShoppingDto(3, "Nikitha", "Laptop", 1, 10000, "4 Stars");

		OnlineShoppingService service = new OnlineShoppingServiceImpl();

		// service.save(dto);
		// service.save(dto1);
		// service.save(dto2);

		OnlineShoppingDto reading = service.findById(1);
		System.out.println(reading);

		System.out.println("==============================================");

		boolean update = service.update(dto);
		System.out.println(update);

		// boolean dlt = service.dalete(dto2);
		// System.out.println(dlt);

		boolean delet = service.deleteById(3);
		System.out.println(delet);

		System.out.println("====================================================");

		List<OnlineShoppingDto> read = service.readAll();
		read.forEach((l) -> System.out.println(l));
	}

}
