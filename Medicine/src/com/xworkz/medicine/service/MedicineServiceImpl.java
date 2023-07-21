package com.xworkz.medicine.service;

import java.util.List;

import com.xworkz.medicine.dto.MedicineDto;
import com.xworkz.medicine.repo.MedicineRepo;
import com.xworkz.medicine.repo.MedicineRepoImpl;

public class MedicineServiceImpl implements MedicineService {

	MedicineRepo repo = new MedicineRepoImpl();

	@Override
	public boolean save(MedicineDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				if (dto.getName() != null && dto.getName().length() > 3) {
					if (dto.getUsedFor() != null) {
						System.out.println("Data is validated");
						repo.save(dto);
						return true;
					}
					System.out.println("Please enter the use");
					return false;
				}
				System.out.println("Name is not valid");
				return false;

			}
			System.out.println("Id is not valid");
			return false;
		}
		System.out.println("Dto is null");
		return false;
	}

	@Override
	public MedicineDto findByName(String name) {
		if (name != null) {
			return repo.findByName(name);

		}
		return null;

	}

	@Override
	public boolean updateusedForByName(String name, String usedFor) {
		if (name != null) {
			if (usedFor != null) {
				System.out.println("Data is validated");
				return repo.updateusedForByName(name, usedFor);

			}
			System.out.println("UsedFor is null");
			return false;
		}
		System.out.println("Name is null");
		return false;
	}

	@Override
	public boolean updateNameAndIdBysideEffect(String name, int rate, String sideEffect) {
		if (name != null) {
			if (rate > 0) {
				if (sideEffect != null) {
					System.out.println("Data is validated");
					repo.updateNameAndIdBysideEffect(name, rate, sideEffect);
					return true;
				}
				System.out.println("side effect is not valid");
				return false;
			}
			System.out.println("rate is not valid");
			return false;
		}
		System.out.println("Name is null");
		return false;
	}

	@Override
	public List<MedicineDto> readAll() {

		return repo.readAll();
	}

	@Override
	public boolean deleteByName(String name) {
		if (name != null) {
			System.out.println("Name is validated");
			repo.deleteByName(name);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndSideEffect(String name, String sideEffect) {
		if(name!=null) {
			if(sideEffect!=null) {
				System.out.println("Data is validated");
				repo.deleteByNameAndSideEffect( name, sideEffect);
				return true;
				
			}
			System.out.println("SideEffect is not valid");
			return false;
		}
		System.out.println("Name is not valid");
		return false;
	}

}
