package com.bridgelabz.day3assignment;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	public static final int NUM_OF_WORKING_DAY= 20;
	public static void main(String[] args) {
		int empRatePerHour = 20;
		int salary;
		int empHrs;
		int totalSalary = 0;
		for(int i=1;i<=NUM_OF_WORKING_DAY;i++)
		{ 
		double empCheck = Math.floor(Math.random()*10)%3;
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
		totalSalary = totalSalary + salary;
		}
		System.out.println("Monthly wage is " + totalSalary);
	}
}
