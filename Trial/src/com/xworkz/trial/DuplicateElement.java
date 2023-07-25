package com.xworkz.trial;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
	
		
		String[] str = {"Java","C","C++","Java","MySQL"," Java"};
		
		
		boolean flag = false;
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println("Duplicate is found"+ str[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false) {
			System.out.println("Duplicate is not found");
		
		}
		
		System.out.println("==============================================");
		//Using HashSet
		
		String[] array= {"Java","C++","C","Ruby","Java","MySql","Java"};
		
		HashSet<String> set = new HashSet();
		
		boolean flag2=false;
		
		for(String ref : array) {
			if(set.add(ref)==false) {
				System.out.println("Duplicate element Found :  "+ref);
				flag2=true;
				
			}
		}
		if(flag2==false) {
		System.out.println("There is no duplicate " );
		}
	}

}
