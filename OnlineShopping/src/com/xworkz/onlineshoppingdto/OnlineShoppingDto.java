package com.xworkz.onlineshoppingdto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="shop_info")
@Entity
public class OnlineShoppingDto {
	
	
	@Id
	private int id;
	private String name;
	private String item;
	private int quantity;
	private int rate;
	private String rating;
	
	
}
