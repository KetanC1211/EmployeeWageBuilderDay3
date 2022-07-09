package com.bridgelabz.day3assignment;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static void main(String[] args) {
		double empCheck = Math.floor(Math.random()*10)%2;
		int empRatePerHour = 20;
		int empHrs = 8;
		int salary;	
		if(empCheck == IS_FULL_TIME) {
			salary = empRatePerHour*empHrs;
			System.out.println("Salary is " + salary);
		}
		else {
			System.out.println("Salary is 0");
		}
	}
}
