package com.xworkz.facebook.dto;

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
@Table(name="facebook_info")
@Entity

public class FaceBookDto {
	
	@Id
	private int id;
	@NotBlank
	@NotEmpty
	@Size(min=3,max=25)
	private String name;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	@NotBlank
	@NotEmpty
	private String password;
	@NotBlank
	@NotEmpty
	private String location;
	private int age;
	
	

}
