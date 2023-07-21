package com.xworkz.doctor.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "doct_info")
@Entity

public class DoctorDto {

	@Id
	private int id;
	private String name;
	private String specialization;
	private int age;
	private String hospitalName;

}
