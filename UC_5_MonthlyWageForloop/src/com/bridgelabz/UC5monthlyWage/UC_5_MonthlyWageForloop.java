package com.bridgelabz.UC5monthlyWage;

public class UC_5_MonthlyWageForloop {
	public static void main(String[] args) {
		//Variable initialization
		//int IS_FULL_TIME = 2;int IS_PART_TIME = 1;
		int empRatePerHour = 20;
		int salary;
		int empHrs;
		int totalSalary = 0;
		//Computation ,Switch not taking double value needed conversion.
		//number of working day is 20
		for(int i=1;i<=20;i++)
		{
		double empCheck = Math.floor(Math.random()*10)%3;
		switch((int)empCheck)
			{
			case 2:
			empHrs = 8;
			break;
			case 1:
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
