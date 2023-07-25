package com.xworkz.eyehospitalform.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.xworkz.eyehospitalform.dto.EyeHospitalFormDto;
import com.xworkz.eyehospitalform.repo.EyeHosptRepo;
import com.xworkz.eyehospitalform.repo.EyeHosptRepoImpl;

public class EyeHopstServiceImpl implements EyeHosptService {

	EyeHosptRepo repo = new EyeHosptRepoImpl();

	@Override
	public boolean save(EyeHospitalFormDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validate = factory.getValidator();
		Set<ConstraintViolation<EyeHospitalFormDto>> violation = validate.validate(dto);

		if (violation.isEmpty()) {
			System.out.println("Data is validated");
			repo.save(dto);
			return true;

		} else {
			System.out.println("Data is not valid");
			System.out.println(violation);
			return false;
		}

	}

	@Override
	public List<EyeHospitalFormDto> readAll() {
		return repo.readAll();
	}

	@Override
	public EyeHospitalFormDto findByPatientName(String name) {
		if (name != null) {
			System.out.println("Input is valid");
			return repo.findByPatientName(name);

		}
		return null;
	}

	@Override
	public EyeHospitalFormDto findById(int id) {
		if (id > 0) {
			System.out.println("Id is valid");
			return repo.findById(id);
		}
		return null;
	}

	@Override
	public boolean updateHospitalNameByName(String hosptName, String name) {
		if (hosptName != null) {
			if (name != null) {
				System.out.println("Input is valid");
				repo.updateHospitalNameByName(hosptName, name);
				return true;
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("HosptName is not valid");
		return false;
	}

	@Override
	public boolean deleteByAge(int age) {
		if (age > 0) {
			System.out.println("age is valid");
			return repo.deleteByAge(age);
		}
		return false;
	}

	@Override
	public boolean deleteByIdAndName(int id, String patName) {
		if (id > 0 && patName != null) {
			System.out.println("Data is Valid");
			repo.deleteByIdAndName(id, patName);
			return true;

		}
		System.out.println("Values are not valid");
		return false;
	}

	@Override
	public boolean updateAgeAndisFirstvisitByHospitalName(int age, boolean isFirstvisit, String hosptName) {
		if (age > 0) {
			if (hosptName != null) {
				System.out.println("Data is validated");
				repo.updateAgeAndisFirstvisitByHospitalName(age, isFirstvisit, hosptName);
				return true;
			}
			System.out.println("Name is not valid");
			return false;
		}
		System.out.println("Id is not valid");
		return false;
	}

}
