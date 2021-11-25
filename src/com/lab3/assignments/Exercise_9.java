package com.lab3.assignments;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class DateCalculator{
	private int years;
	private int months;
	private int days;
	
	public DateCalculator() {
		super();
		this.years = years;
		this.months = months;
		this.days = days;
	}
	
	public DateCalculator(int years, int months, int days) {
		super();
		this.years = years;
		this.months = months;
		this.days = days;
	}
	
	public void duration(Integer days, Integer months, Integer years) {
		LocalDate GivenDate = LocalDate.of(years, months, days);
		LocalDate CurrentDate = LocalDate.now();
		
		Period period = Period.between(GivenDate, CurrentDate);
		
		System.out.println("Duration in Days: " +period.getDays());
		System.out.println("Duration in Months: " + period.getMonths());
		System.out.println("Duration in Years: " +period.getYears());
	}
	
}

public class Exercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day: ");
		int days = sc.nextInt();
		System.out.println("Enter the Month:");
		int months = sc.nextInt();
		System.out.println("Enter the Year: ");
		int years = sc.nextInt();
		
		DateCalculator dc = new DateCalculator();
		dc.duration(days, months, years);
	}

}
