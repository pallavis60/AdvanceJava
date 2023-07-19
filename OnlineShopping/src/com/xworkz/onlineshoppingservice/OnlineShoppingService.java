package com.xworkz.onlineshoppingservice;

import java.util.List;

import com.xworkz.onlineshoppingdto.OnlineShoppingDto;

public interface OnlineShoppingService {

	public boolean save(OnlineShoppingDto dto);

	public List<OnlineShoppingDto> readAll();

	public OnlineShoppingDto findById(int id);

	public boolean update(OnlineShoppingDto dto);

	public boolean dalete(OnlineShoppingDto dto);

	public boolean deleteById(int id);

}
