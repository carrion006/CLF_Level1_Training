package com.lab3.assignments;

import java.util.Scanner;

class MirrorImage {
	public String getImage(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		sb1.append("|");
		StringBuffer sb2 = new StringBuffer(str);
		sb2.reverse();
		sb1.append(sb2);
		
		return sb1.toString();
	}
}

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value: ");
		str = sc.nextLine();
		MirrorImage mi = new MirrorImage();
		System.out.println("Entered String is: " + str);
		System.out.println("Mirror imaged String is: "+ mi.getImage(str));
	}

}
