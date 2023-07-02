package com.xworkz.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamApiRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("paytm");
		list.add("ZOMATO");
		list.add("snapchat");
		list.add("duolingo");
		list.add("instagram");
		list.add("MEESHO");
		list.add("true caller");
		list.add("flipkart");
		list.add("facebook");
		list.add("whatsapp");
		list.add("amazon");
		list.add("telegram");
		list.add("google pay");
		list.add("spotify");
		list.add("pocketfm");
		list.add("teraBox app");
		list.add("MYNTRA");
		list.add("MESSENGER");
		list.add("rapido");
		list.add("music player");
		list.add("YOU TUBE");

		list.forEach((li) -> {
			System.out.println(li);
		});

		Stream<String> strr = list.stream();
		List<String> str = strr.filter((app) -> app.contains("i")).collect(Collectors.toList());

		Stream<String> strr2 = list.stream();
		List<String> str2 = strr2.map((app) -> app.toLowerCase()).collect(Collectors.toList());

		Stream<String> strr3 = list.stream();
		List<String> str3 = strr3.sorted().collect(Collectors.toList());

		Stream<String> strr4 = list.stream();
		List<String> str4 = strr4.filter((app) -> !app.contains(" ")).collect(Collectors.toList());

		Stream<String> strr5 = list.stream();
		List<String> str5 = strr5.filter((app) -> app.startsWith("A") || app.contains("B") || app.contains("C")
				|| app.contains("D") || app.contains("E") || app.contains("F") || app.contains("G") || app.contains("H")
				|| app.contains("I") || app.contains("J") || app.contains("K") || app.contains("L") || app.contains("M")
				|| app.contains("N") || app.contains("O") || app.contains("P") || app.contains("Q") || app.contains("R")
				|| app.contains("S") || app.contains("T") || app.contains("U") || app.contains("V") || app.contains("W")
				|| app.contains("X") || app.contains("Y") || app.contains("Z")).collect(Collectors.toList());

		System.out.println("====================");

		str.forEach((l) -> {
			System.out.println(l);
		});

		System.out.println("=======================================");
		str2.forEach((l) -> {
			System.out.println(l);
		});
		System.out.println("==========================================");

		str3.forEach((l) -> {
			System.out.println(l);
		});

		System.out.println("======================================");

		str4.forEach((l) -> {
			System.out.println(l);
		});

		System.out.println("==========================================================");

		System.out.println();
		str5.forEach((l) -> {
			System.out.println(l);
		});

	}

}
