package com.xworkz.instagram2.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(appliesTo = "Instagram2Dto")
@Entity


public class Instagram2Dto {
	@Id
	private int id;
	private String name;
	private String email;
	private long num;
	private String location;
	private String password;

}
