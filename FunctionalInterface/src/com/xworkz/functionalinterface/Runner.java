package com.xworkz.functionalinterface;

public class Runner  {

	public static void main(String[] args) {
		
		Game game = ()->{
			System.out.println("Method from game interface");
		};
		
		
		Newspaper paper = ()->{
			System.out.println("Method from Newspaper inerface");
		};
		
		Eclipse eclipse = ()->{
			System.out.println("Method from Eclipse Interface");
		};
		
		game.giveVisuospatialAbility();
		paper.giveInformation();
		eclipse.goodForJavaCodeDevlopment();

	}

}
