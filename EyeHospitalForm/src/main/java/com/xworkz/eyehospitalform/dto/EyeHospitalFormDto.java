package com.xworkz.eyehospitalform.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Eye_info")
@Entity


public class EyeHospitalFormDto {
	
	@Id
	private int id;
	
	@NotBlank
	@NotEmpty
	@Size(min=3,max=11)
	private String HospitalName;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=11)
	private String patientName;
	private int age;
	@NotBlank
	@NotEmpty
	private String location;
	private boolean isFirstvisit;
	

}
