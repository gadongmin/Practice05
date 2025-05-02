package com.javaex.ex09;

public class StringUtil {
	
	
	public static String concatString(String[] strArray) {
		String result = "";
		
		for(int i = 0; i<strArray.length; i++) {
			result = result + strArray[i];
		}
		
		return result;

	}

}
