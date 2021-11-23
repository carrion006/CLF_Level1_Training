package com.lab2.assignments;

import java.util.Arrays;
import java.util.Scanner;


class Test3{
	public int[] getSorted(int[] arr) {
		
		int rev_arr[] = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			rev_arr[i] = reverseDigits(arr[i]);
		}
		Arrays.sort(rev_arr);
		
		return rev_arr;
	}

	static int reverseDigits(int num) {
		// TODO Auto-generated method stub
		int rev_num = 0;
		while(num>0) {
			rev_num =  	rev_num * 10 + num % 10;
			num = num / 10;
		}
		
		return rev_num;
	}
}

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		System.out.println("Before reverse sorting");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+ i + " index element");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("After reverse sorting");
		Test3 t = new Test3();
		for(int num : t.getSorted(arr)) {
			System.out.println(num + "");
		}
		
	}

}
