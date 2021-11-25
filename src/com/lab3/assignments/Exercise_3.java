package com.lab3.assignments;

import java.util.Scanner;

class ConvertAlphabets{
	private static final String  consonants = "BCDFGHJKLMNPQRSTVWXYZ";
	private int consLength = consonants.length();
	
	public String alterString(String str) {
		int index = 0;
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			index = consonants.indexOf(charArray[i]);
			if(index != -1) {
				charArray[i] = consonants.charAt((index + 1) % consLength);
			}
		}
		return new String(charArray);
	}
}

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ConvertAlphabets ca = new ConvertAlphabets();
		
		System.out.println("Enter the String Value: ");
		String str = sc.nextLine();
		System.out.println("Before Altering String :"+ str);
		System.out.println("After Altering String : " + ca.alterString(str.toUpperCase()));

	}

}
