package com.lab1.assignments;

import java.util.*;

public class Exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value : ");
		int n = sc.nextInt();
		System.out.println("Sum of "+ n +" natural numbers divisible by 3 or 5 is : " + calculateSum(n));
	}

	private static int calculateSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<n+1;i++) {
			if(i%3==0 || i%5==0) {
				sum += i; 
			}
		}
		
		return sum;
		
	}
	
	

}

