package com.bridglelap.UC_6_Whileloop;

public class UC_6_Whileloop {
	public static void main(String[] args) {
			//Variable initialization
			//int IS_FULL_TIME = 2;int IS_PART_TIME = 1;
			int empRatePerHour = 20;
			int salary;
			int empHrs;
			int totalSalary = 0;
			int totalWorkingdays = 0,totalEmpHrs = 0; 
			//Computation ,Switch not taking double value needed conversion.
			//number of working day is 20
			while(totalEmpHrs <= 100 && totalWorkingdays <=20)
			{
			double empCheck = Math.floor(Math.random()*10)%3;
			switch((int)empCheck)
				{
				case 2: // Fulltime=2
				empHrs = 8;
				break;
				case 1: // Parttime=1
				empHrs = 4;
				break;
				default:
				empHrs =0; //Absent=0
				}
			salary = empRatePerHour*empHrs;
			totalSalary = totalSalary + salary;
			totalEmpHrs = totalEmpHrs + empHrs;
			totalWorkingdays++;
			}
			System.out.println("Monthly wage is " + totalSalary);
		}
}
