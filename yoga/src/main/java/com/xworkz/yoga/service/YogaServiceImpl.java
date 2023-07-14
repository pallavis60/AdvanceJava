package com.xworkz.yoga.service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.yoga.dto.YogaDto;
import com.xworkz.yoga.repository.YogaRepository;
import com.xworkz.yoga.repository.YogaRepositoryImpl;

public class YogaServiceImpl implements YogaService {

	YogaRepository repo = new YogaRepositoryImpl();

	@Override
	public boolean save(YogaDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validate = factory.getValidator();
		java.util.Set<ConstraintViolation<YogaDto>> violation = validate.validate(dto);

		if (violation.isEmpty()) {
			System.out.println("no violation");
			boolean save = repo.save(dto);
			System.out.println(save);

		} else {
			System.out.println(violation);
			return false;
		}

		return false;
	}

	@Override
	public boolean findByName(String name) {
		if (name != null) {
			boolean find = repo.findByName(name);
			System.out.println(find);
			return true;
		}
		return false;
	}

}
