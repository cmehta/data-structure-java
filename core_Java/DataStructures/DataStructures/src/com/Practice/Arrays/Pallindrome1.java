package com.Practice.Arrays;

import java.util.Arrays;

public class Pallindrome1 {

	public static void main(String[] args) {
		Long number = new Long(121);
		
		new Pallindrome1().pallindrome(number);
	}

	private void pallindrome(Long number) {
		char[] ar = new char[number.toString().length()];
		int i = number.toString().length();
		for(char ch : number.toString().trim().toCharArray()){
			ar[i-1] = ch;
			i--;
		}
		System.out.println(number.toString().toCharArray().getClass());
		System.out.println(ar.getClass());
		if(Arrays.equals(number.toString().trim().toCharArray(), ar)){
			System.out.println("number is pallindrome!");
		}
		else{
			System.out.println("Not a pallindrome.");
		}
	}

}
