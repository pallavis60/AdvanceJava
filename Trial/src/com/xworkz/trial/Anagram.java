package com.xworkz.trial;
  
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		boolean result = isAnagram("Listen", "Silent");
		System.out.println(result);

	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);

		}
	}

}
