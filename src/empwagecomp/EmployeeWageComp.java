package empwagecomp;

import java.lang.Math;

public class EmployeeWageComp {
	private static final int emp_wage_per_hour=20;
	public static void main(String[] args) {
		int is_present=(int)(Math.random()*30 % 3);
		int emp_hour=0;
		switch (is_present) {
		case 1:
			emp_hour=8;
			break;
		case 2:
			emp_hour=4;
			break;
		default:
			emp_hour=0;
			break;
		}
		System.out.println("");
		int emp_daily_wage;
		emp_daily_wage=emp_hour*emp_wage_per_hour;
		System.out.println("Employee wage per day is "+emp_daily_wage);
		
	}
}
