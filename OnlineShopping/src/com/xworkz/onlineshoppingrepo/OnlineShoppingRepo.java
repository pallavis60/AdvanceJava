package com.xworkz.onlineshoppingrepo;

import java.util.List;

import com.xworkz.onlineshoppingdto.OnlineShoppingDto;

public interface OnlineShoppingRepo {

	public boolean save(OnlineShoppingDto dto);

	public List<OnlineShoppingDto> readAll();

	public OnlineShoppingDto findById(int id);

	public boolean update(OnlineShoppingDto dto);

	public boolean delete(OnlineShoppingDto dto);

	public boolean deleteBYId(int id);

}
