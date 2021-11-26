package com.lab5.assignments;

import java.util.Scanner;

class EmployeeException extends Exception{

	public EmployeeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of employee: ");
		int salary =sc.nextInt();
		
		try {
			if(salary<3000) {
				throw new EmployeeException("Regret to tell you that you're not eligible for the program!");
			}
			else {
				System.out.println("Your salary "+salary+" is eligible for the program!");
			}
		}
		catch (EmployeeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
