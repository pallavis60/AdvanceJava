package com.xworkz.trial;

public class CountingVowelAndConsonents {

	public static void main(String[] args) {

		String str = "We are learning Java";
		int count = 0;
		int vCount = 0;
		int cCount = 0;

	  str =	str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
					|| str.charAt(i) == 'i') {
				vCount++;
			}

			else if (str.charAt(i) > 'a' && str.charAt(i) <= 'z') {
				cCount++;

			}
		}
		System.out.println("Total Characters   " + count);
		System.out.println("TotalVowels Present   " + vCount);
		System.out.println("TotalConsonets    " + cCount);

	}

}
