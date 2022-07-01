package UC_2_EmployeeDailywage;

public class UC_2_EmployeeDailywage {
	public static void main(String[] args) {
		//Variable initialization
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random()*10)%2;	
		int empRatePerHour = 20;
		int empHrs = 8;
		int salary;
		//Computation 
		if(empCheck == IS_FULL_TIME)
		{
			salary = empRatePerHour*empHrs;
			System.out.println("Salary is " + salary);
		}
		else
		{
			System.out.println("Salary is 0");
		}
}
}