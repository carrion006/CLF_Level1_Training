package com.lab3.assignments;

import java.util.Scanner;

class ShiftDigits{
	public int modifyNumber(int number) {
		Integer num = number;
		int output;
		String str_num,new_num="";
		
		str_num = num.toString();
		StringBuffer sb = new StringBuffer(new_num);
		char[] charArray = str_num.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++) {
			Integer temp = Math.abs(charArray[i] - charArray[i+1]);
			sb.append(temp.toString());
		}
		char digit = str_num.charAt(str_num.length()-1);
		sb.append(digit);
		output = Integer.parseInt(sb.toString());
		
		return output;
	}
}

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer Value: ");
		int num = sc.nextInt();
		
		ShiftDigits sd = new ShiftDigits();
		System.out.println("Modified number is: " +sd.modifyNumber(num));
		
	}

}
