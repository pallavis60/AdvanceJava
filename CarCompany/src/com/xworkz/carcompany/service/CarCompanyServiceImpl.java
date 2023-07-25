package com.xworkz.carcompany.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.hibernate.internal.build.AllowSysOut;

import com.xworkz.carcompany.dto.CarCompanyDto;
import com.xworkz.carcompany.repo.CarCompanyRepo;
import com.xworkz.carcompany.repo.CarCompanyRepoImpl;


public class CarCompanyServiceImpl implements CarCompanyService {
	
	CarCompanyRepo repo = new CarCompanyRepoImpl();


	@Override
	public boolean save(CarCompanyDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validate = factory.getValidator();
		Set<ConstraintViolation<CarCompanyDto>> violation = validate.validate(dto);

		if (violation.isEmpty()) {
			System.out.println("Data is validated");
			repo.save(dto);
		return true;
		}else {
			System.out.println("Data is not valid");
			System.out.println(violation);
			return false;
		}
	}

	@Override
	public List<CarCompanyDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public CarCompanyDto findById(int id) {
		if(id>0) {
			System.out.println("Id is validated");
			return repo.findById(id);
		}
		System.out.println("Id is not valid");
		return null;
	}

	@Override
	public CarCompanyDto findBYName(String name) {
		if(name!=null) {
			System.out.println("Name is valid");
			return repo.findBYName(name);
		}
		System.out.println("Name is not valid");
		return null;
	}

	@Override
	public boolean updateBYId(int id, String name) {
		if(id>0) {
			if(name!=null) {
				System.out.println("Data is valid");
				return repo.updateBYId(id, name);
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("Id is not valid");
		return false;
	}

	@Override
	public boolean updateBYIdAndName(int id, String name, String brand) {
		if(id>0) {
			if(name!=null) {
				if(brand!=null) {
					System.out.println("Inputs are valid");
					return repo.updateBYIdAndName(id, name, brand);
				}
				System.out.println("Brand is not valid");
				return false;
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("Id is not valid");
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			System.out.println("is id valid");
			return repo.deleteById(id);
			
		}
		System.out.println("Id is not valid");
		return false;
	}

}
