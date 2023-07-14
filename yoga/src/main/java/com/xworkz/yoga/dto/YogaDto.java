package com.xworkz.yoga.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class YogaDto {
	
	
	@NotBlank
	@NotEmpty
	@Size(min=2,max=20)
	private String name;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	private String city;
	@NotBlank
	@NotEmpty
	private String age;
	@NotBlank
	@NotEmpty
	private String motive;
	@NotBlank
	@NotEmpty
	private String experience;
	private String weight;
	private String height;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	private String number;

}
