package empwagecomp;

import java.lang.Math;

public class EmployeeWageComp {
	private static final int emp_wage_per_hour = 20;

	public static void main(String[] args) {
		int total_emp_hours = 0, total_emp_days = 1, monthly_salary = 0;
		while (total_emp_hours < 100 && total_emp_days <= 20) {
			int emp_hour=employeeHours();
			int emp_daily_wage=employeeWage(emp_hour);
			System.out.println("Employee wage on day " + total_emp_days + " is " + emp_daily_wage);
			total_emp_days++;
			monthly_salary += emp_daily_wage;
			total_emp_hours += emp_hour;
		}
		System.out.println("Monthly salary is " + monthly_salary);
	}
	private static int employeeHours() {
		int is_present = (int) (Math.random() * 30 % 3);
		int emp_hour = 0;
		switch (is_present) {
		case 1:
			emp_hour = 8;
			break;
		case 2:
			emp_hour = 4;
			break;
		default:
			emp_hour = 0;
			break;
		}
		return emp_hour;
	}
	private static int employeeWage(int emp_hours) {
		int emp_daily_Wage=emp_hours*emp_wage_per_hour;
		return emp_daily_Wage;
	}
}
