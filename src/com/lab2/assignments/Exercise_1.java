package com.lab2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Test{
	public int getSecondSmallest(int arr[]) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		
		return list.get(1);
	}
}


public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+ i + " index element");
			arr[i] = sc.nextInt();
		}
		Test t = new Test();
		 t.getSecondSmallest(arr);
		System.out.println("Second smallest element in the given array is " + t.getSecondSmallest(arr));
	}

}
