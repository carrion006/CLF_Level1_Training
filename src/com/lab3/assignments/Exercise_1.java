package com.lab3.assignments;

import java.util.*;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,sum=0;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integers with one spaced gap : ");
		
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println("Entered Numbers are : ");
		
		while(st.hasMoreTokens()) {
			String emptyStr = st.nextToken();
			num = Integer.parseInt(emptyStr);
			System.out.println(num+"");
			sum+=num;
		}
		System.out.println("Sum of given Integer is : "+sum);
		sc.close();
	}

}
