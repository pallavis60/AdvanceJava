package com.xworkz.onlineshoppingservice;

import java.util.List;

import com.xworkz.onlineshoppingdto.OnlineShoppingDto;
import com.xworkz.onlineshoppingrepo.OnlineShoppingRepo;
import com.xworkz.onlineshoppingrepo.OnlineShoppingRepoImpl;

public class OnlineShoppingServiceImpl implements OnlineShoppingService {

	OnlineShoppingRepo repo = new OnlineShoppingRepoImpl();

	@Override
	public boolean save(OnlineShoppingDto dto) {

		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getName() != null && dto.getName().length() > 3) {
					if (dto.getItem() != null) {
						if (dto.getQuantity() > 0) {
							System.out.println("data is validated");
							repo.save(dto);
							return true;
						}
						System.out.println("Quantity is not valid");
						return false;
					}
					System.out.println("Item is not valid");
					return false;
				}
				System.out.println("Name is not valid");
				return false;
			}
			System.out.println("id is not valid");
			return false;
		}
		System.out.println("Dto is not valild");
		return false;
	}

	@Override
	public List<OnlineShoppingDto> readAll() {

		List<OnlineShoppingDto> list = repo.readAll();
		return list;
	}

	@Override
	public OnlineShoppingDto findById(int id) {
		if (id > 0) {
			System.out.println("Id is valid");
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public boolean update(OnlineShoppingDto dto) {
		if (dto != null) {
			System.out.println("dto is validated");
			repo.update(dto);
			return true;

		}
		return false;

	}

	@Override
	public boolean dalete(OnlineShoppingDto dto) {
		if (dto != null) {
			System.out.println("Dto is validate");
			repo.delete(dto);
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if (id > 0) {
			OnlineShoppingDto dto = repo.findById(id);
			repo.delete(dto);
			return true;

		}

		return false;

	}

}
