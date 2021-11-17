package com.lab1.assignments;

import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		if (CheckNumber(num) == true) {
			System.out.println("Entered number " + num + " is power of 2");
		} else {
			System.out.println("Entered number " + num + " is not a power of 2");
		}

	}

	private static boolean CheckNumber(int n) {
		// TODO Auto-generated method stub

		boolean flag = false;
		if (n == 0) {
			return flag;
		}
		while (n != 1) {
			n = n / 2;
			if (n % 2 != 0 && n != 1) {
				return flag;
			}
		}
		return flag = true;
	}
}
