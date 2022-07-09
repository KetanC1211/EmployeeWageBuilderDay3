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
		switch((int)empCheck)
		{
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs =0;
		}
		salary = empRatePerHour*empHrs;
		System.out.println("Salary is " + salary);
	}
}
