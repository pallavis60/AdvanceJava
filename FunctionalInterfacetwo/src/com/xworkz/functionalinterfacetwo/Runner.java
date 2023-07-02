package com.xworkz.functionalinterfacetwo;

public class Runner {

	public static void main(String[] args) {

//		Book book = (no1, no2) -> {
//			System.out.println(no1);
//			System.out.println(no2);
//
//			return no1 + no2;
//		};
//

		
		Book book = (no)->{
			return no;
		};
		
		
		int value = book.bookNo(10);
		System.out.println(value);
		
//		int value1 = book.totalBokk(10,20);
//		System.out.println(value);
//		
		
	}

}
