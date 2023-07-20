package com.xworkz.medicine.dto;

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
@Table(name="medi_info")
@Entity
public class MedicineDto {
	
	@Id
	private int id;
	private String name;
	private String usedFor;
	private int rate;
	private String chemical;
	private String sideEffect;
	

}
