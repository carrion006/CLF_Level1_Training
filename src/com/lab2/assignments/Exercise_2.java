package com.lab2.assignments;

import java.util.Arrays;
import java.util.Scanner;

class Test2{
	public String sortString(String[] arr) {
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
}

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size  = sc.nextInt();
		String[] arr = new String[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+ i + " index element");
			arr[i] = sc.next();
		}
		Test2 t = new Test2();
		t.sortString(arr);
		System.out.println("Sorted Strings are : " + t.sortString(arr));
	}

}
