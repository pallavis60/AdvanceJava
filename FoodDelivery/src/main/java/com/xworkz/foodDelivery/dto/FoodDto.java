package com.xworkz.foodDelivery.dto;

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
@Getter
@Setter
@ToString
public class FoodDto {
	
	@NotBlank
	@NotEmpty
	@Size(min=2,max=20)
	private String PizzaName;
	@NotBlank
	@NotEmpty
	private String type;
	@NotBlank
	@NotEmpty
	private String location;
	@NotBlank
	@NotEmpty
	private String PaymentMode;

}
