package com.xworkz.facebook.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;


import com.xworkz.facebook.dto.FaceBookDto;
import com.xworkz.facebook.repo.FaceBookRepo;
import com.xworkz.facebook.repo.FaceBookRepoImpl;

public class FaceBookServiceImpl  implements FaceBookService{
	
	FaceBookRepo repo = new FaceBookRepoImpl();

	@Override
	public boolean save(FaceBookDto dto) {
		
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validate = factory.getValidator();
		Set<ConstraintViolation<FaceBookDto>> violation = validate.validate(dto);
		
		if(violation.isEmpty()) {
			System.out.println("Data is validated");
			return repo.save(dto);
		}else {
			System.out.println("Data is not valid");
			System.out.println(violation);
			return false;
		}
	}

	@Override
	public List<FaceBookDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public FaceBookDto findById(int id) {
		if(id>0) {
			System.out.println("Id is valid");
			return repo.findById(id);
		}
		System.out.println("Is is not valid");
		return null;
	}

	@Override
	public FaceBookDto findByName(String name) {
		if(name!=null) {
			System.out.println("Name is valid");
			return repo.findByName(name);
		}
		System.out.println("name is not valid");
		return null;
	}

	@Override
	public boolean updateById(int id, String name) {
		if(id>0) {
			if(name!=null) {
				System.out.println("Inputs are valid");
				return repo.updateById(id, name);
				
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("Id is not valid");
		return false;
	}

	@Override
	public boolean updateByNameAndId(String name, int id, String email) {
		if(id>0) {
			if(name!=null) {
				if(email!=null) {
					System.out.println("Data is validated");
					return repo.updateByNameAndId(name, id, email);
				}
				System.out.println("email is not valid");
				return false;
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("id is not valid");
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			System.out.println("Id is valid");
			return repo.deleteById(id);
		}
		System.out.println("Id is not valid");
		return false;
	}

}
