package com.xworkz.lambda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		
		
		MyComp com = (o1,o2)->{
			if(o1<o2) {
				return 1;
			}
			else {
				return-1;
			}
		};
		
		Collections.sort(list,com);
		list.forEach((li)->{System.out.println(li);});
		
		
		
		
		
	}

}
