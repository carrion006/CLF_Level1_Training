package com.lab2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Test4{
	public int[] modifyArray(int[] arr) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int result[] = new int[set.size()];
		
		for(int i=0; i<set.size();i++) {
			result[i] = (int) set.toArray()[i];
		}
		Arrays.sort(result);	
			
		return result;
	}
}

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = new Test4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size  = sc.nextInt();
		int arr[] =  new int[size];
		
		System.out.println("Array before duplicate removal descending  sort :");
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+ i + " index element");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array after duplicate removal descending  sort :");
		for(int i=t.modifyArray(arr).length-1;i>=0;i--) {
			System.out.println(t.modifyArray(arr)[i]+"");
		}
	}

}
