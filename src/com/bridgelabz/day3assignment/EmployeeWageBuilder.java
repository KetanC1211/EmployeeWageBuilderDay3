package com.bridgelabz.day3assignment;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static void main(String[] args) {
		double empCheck = Math.floor(Math.random()*10)%3;
		int empRatePerHour = 20;
		int salary;
		int empHrs;
		//Computation 
		if(empCheck == IS_FULL_TIME)
		{
			empHrs = 8;
		}
		else if(empCheck == IS_PART_TIME)
		{
			empHrs = 4;
		}
		else 
		{
			empHrs = 0;
		}
		salary = empRatePerHour*empHrs;
		System.out.println("Salary is " + salary);
	}
}
