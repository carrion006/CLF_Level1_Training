package com.lab5.assignments;

import java.util.Scanner;

class ValidateNameException extends Exception{

	public ValidateNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fName = sc.nextLine();
		System.out.println("Enter your Last name: ");
		String lName = sc.nextLine();
		
		try {
			if(fName == "" | lName == "")
			{
				String errorField = fName == "" ? "First Name" : "Last Name";
				throw new ValidateNameException(errorField+"Name can't be blank");
			}
			else {
				System.out.println("Entered name is: " +fName+" "+lName);
			}
		}
		catch (ValidateNameException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
