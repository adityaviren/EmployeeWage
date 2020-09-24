package empwagecomp;

import java.util.Scanner;

public class EmployeeWageComp {
	private static final int emp_wage_per_hour=20;
	public static void main(String[] args) {
		double random_present=Math.random();
		String message = (random_present < 0.5) ? "Employee is present" : "Employee is absent" ;
		int emp_hour = (random_present < 0.5) ? 8 : 0;
		System.out.println(message);
		int emp_daily_wage;
		emp_daily_wage=emp_hour*emp_wage_per_hour;
		System.out.println("Employee wage per day is "+emp_daily_wage);
		
	}
}
