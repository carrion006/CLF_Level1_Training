package com.lab1.assignments;

import java.util.*;

public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if (CheckNumber(num) == true) {
			System.out.println(num + " is an increasing Number");
		} else {
			System.out.println(+ num + " is not an increasing Number");
		}
	}

	private static boolean CheckNumber(int n) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int CurrentDigit = n % 10;
		n /= 10;
		while (n > 0) {
			if (CurrentDigit <= n) {
				flag = true;
				break;
			}
			CurrentDigit = n % 10;
			n /= 10;
		}
		return flag;
	}

}
