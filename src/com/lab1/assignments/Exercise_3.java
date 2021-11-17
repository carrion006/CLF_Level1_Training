package com.lab1.assignments;
import java.util.Scanner;
import java.io.*;
import java.lang.*;


//Non-recursive Method

/*public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i,a=1,b=1,c=0,t;
		System.out.print("Enter the value :");
		t=input.nextInt();
		for(i=0;i<t-2;i++) {
		c=a+b;
		a=b;
		b=c;
		}
		System.out.print(t+"th value of Fibonacci series is: "+c);
		}
	}	*/

//Recursive Method


public class Exercise_3 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.print("Enter the number : ");
		int n=Integer.parseInt(br.readLine());
		RecursiveApp ob=new RecursiveApp();
		int res=0;
		for(int i=1;i<=n;i++) {
			res=ob.fib(i);
			System.out.println(" "+res);
			}
			System.out.println();
			System.out.println(n+"th value of Fibonacci series is : "+res);

	}

}

 class RecursiveApp {

	public int fib(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return (1);
			else if(n==2)
			return (1);
			else
			return (fib(n-1)+fib(n-2));
	}

}



