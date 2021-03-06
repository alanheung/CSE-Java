package com.stringreverse;
import java.util.ArrayList;
import java.util.List;

public class StringReverse {

	public static String reverse(String s) {
		List<String> tempArray = new ArrayList<String>(s.length());
		for (int i = 0; i < s.length(); i++) {
			tempArray.add(s.substring(i, i + 1));
		}
		StringBuilder reversedString = new StringBuilder(s.length());
		for (int i = tempArray.size() - 1; i >= 0; i--) {
			reversedString.append(tempArray.get(i));
		}
		return reversedString.toString();
	}

}

//Start with the following Java Code. The code is an attempt to write a String 
//reversing method, but it contains an error. Write a test and see if you can 
//find the error in the code.(2nd for loop should have i>=0 NOT i>0 as it ignores the first letter when reversing it back)
//Think about writing a number of tests � treating the class as a black box.
