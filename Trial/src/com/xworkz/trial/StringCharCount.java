package com.xworkz.trial;

public class StringCharCount {

	public static void main(String[] args) {
		
		
		String str = "Java Is a Programming Language";
		
//		int total_count = str.length();
//		System.out.println(total_count);
//		
//		int afterRemovingA=str.replace("J", "").length();
//		System.out.println(afterRemovingA);
//		
//		int numberOfAPresent = total_count - afterRemovingA;
//		System.out.println(numberOfAPresent);
		
		int count =0;
		char search = 'a';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==search) {
				count ++;
				
			}
			
		}
		System.out.println(count); 
	}

}
