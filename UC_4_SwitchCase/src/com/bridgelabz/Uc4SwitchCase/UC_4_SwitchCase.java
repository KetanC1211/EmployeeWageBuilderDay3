package com.bridgelabz.Uc4SwitchCase;

public class UC_4_SwitchCase {
	public static void main(String[] args) {
		//Variable initialization
		//int IS_FULL_TIME = 2;
		//int IS_PART_TIME = 1;
		double empCheck = Math.floor(Math.random()*10)%3;	
		int empRatePerHour = 20;
		int salary;
		int empHrs;
		//Computation 
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
		System.out.println("Salary is " + salary);
}
}
