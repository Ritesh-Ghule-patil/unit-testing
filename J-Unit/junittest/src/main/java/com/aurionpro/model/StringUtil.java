package com.aurionpro.model;

public class StringUtil {
	
	String truncateAInFirst2Place(String s) {
		
		
		String ans="";
		for(int i=0; i<s.length(); i++) {
			if( i<=1 && (s.charAt(i)=='a' || s.charAt(i)=='A')) {
				continue;
			}
			ans += s.charAt(i);
		}
		return ans;
	}
	
	boolean firstAndLastTwoCharAreEqual(String s) {
		
		int size = s.length();
		
		if(s.length()<4) {
			return false;
		}
		s=s.trim();
		System.out.println(s);
		if(s.isEmpty()) {
			return false;
		}
		
		String firstTwo ="";
		String lastTwo ="";
		firstTwo += s.charAt(0);
		firstTwo += s.charAt(1);
		lastTwo += s.charAt(size-2);
		lastTwo += s.charAt(size-1);
		
//		System.out.println(firstTwo+ " " + lastTwo);
		if(firstTwo.equalsIgnoreCase(lastTwo)) {
			return true;
		}
		return false;
	}
	

}
