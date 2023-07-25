package com.xworkz.carcompany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="comp_info")
@Entity

public class CarCompanyDto {
	
	
	@Id
	private int id;
	
	@NotBlank
	@NotEmpty
	@Size(min=3, max=25)
	private String companyName;
	@NotBlank
	@NotEmpty
	@Size(min=3, max=25)
	private String brand;
	private int totalCars;
	private int totalModels;
	@NotBlank
	@NotEmpty
	private String location;
	@NotBlank
	@NotEmpty
	@Email
	@Size(min=3, max=25)
	private String emailOfCompany;

}
