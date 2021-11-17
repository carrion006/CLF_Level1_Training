package com.lab1.assignments;
import java.util.*;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value : "); 
		int maxNum = sc.nextInt();
		System.out.println("Prime Numbers below " + maxNum + " are : ");
		for(int num=2; num<=maxNum;num++) {
			boolean flag = true;
			for(int i=2;i<=num/2;i++) {
				
				if(num%i==0) {
					flag = false;
				}
			}
			if(flag==true) {
			System.out.println(num);
			}
		}
		
	}
}

