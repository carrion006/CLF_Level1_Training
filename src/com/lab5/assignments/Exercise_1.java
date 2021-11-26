package com.lab5.assignments;

import java.util.Scanner;

class AgeException extends Exception{

	public AgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

public class Exercise_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			if(age<18) 
				throw new AgeException("Oops you're minor please view content reagrding your age field!");
				else
					System.out.println("You're age is valid for the content");
			
			}
			catch (AgeException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
