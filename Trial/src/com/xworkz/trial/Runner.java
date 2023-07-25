package com.xworkz.trial;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number");
//		 
//		
//		int num =sc.nextInt();
//		int org_num=num;
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		if(org_num==rev) {
//			System.out.println(org_num + "Number is palindrome");
//		}
//		else {
//			System.out.println(org_num + "Number is not palidrom");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter A String");
//		
//		String str = sc.next();
//		String org_str = str;
//		String rev=" ";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		
//		if(org_str.equals(rev)) {
//			System.out.println(org_str + "  Is a Palindrome");
//			
//		}
//		else {
//			System.out.println(org_str + "  Is not a Palindrome");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		
//		int num = sc.nextInt();
//		int org_num= num;
//		int rev = 0;
//		while(num!=0) {
//			rev =rev*10 + num%10;
//			num=num/10;
//		}
//		System.out.println(rev);
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int num=sc.nextInt();
		
		
//		StringBuffer buff = new StringBuffer(String.valueOf(num));
//		 StringBuffer value = buff.reverse();
//		 System.out.println(value);
//		 
	
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
	StringBuilder rev=	sbl.reverse();
	System.out.println(rev);
	}
}
  