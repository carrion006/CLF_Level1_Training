package com.lab1.assignments;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		int num,data,temp,sum=0;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number : ");
		 num = console.nextInt();

		 temp = num;
		 while(temp>0) {
		 int digit = temp % 10;
		 sum += Math.pow(digit,3);
		 temp /=10;
		 }

		 System.out.println("Sum of Cube of digits for "+num+" is : "+sum);

	}

}
