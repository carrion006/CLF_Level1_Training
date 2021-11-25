package com.lab3.assignments;

import java.util.Scanner;

class PositiveString{
	public boolean  check (String str) {
		boolean flag = false;
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			char temp1 = charArray[i];
			char temp2 = charArray[i+1];
			int ascii_temp1 = temp1;
			int ascii_temp2 = temp2;
			
			if(ascii_temp1<ascii_temp2 == true) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PositiveString ps = new PositiveString();
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		if(ps.check(str)) {
			System.out.println(str+" is a positive string");
		}
		else {
			System.out.println(str+"is a negative string");
		}
		
	}

}
