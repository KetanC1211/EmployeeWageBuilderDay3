package com.bridgelabz.UC_3_partTimeemp;

public class UC_3_PartTimeEmployee {
	public static void main(String[] args) {
		//Variable initialization
		int IS_FULL_TIME = 2;
		int IS_PART_TIME = 1;
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
