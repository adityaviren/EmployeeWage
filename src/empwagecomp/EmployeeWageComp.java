package empwagecomp;

import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation Program");
		isPresent();
		System.out.println("Enter 1 if you are Regular Employee\nEnter 2 if you are Part Time Employee");
		int employee_case=sc.nextInt();
		long daily_wage;
		switch(employee_case){
		case 1:
			daily_wage=calculateDailyWage();
			break;
		case 2:
			daily_wage=calculatePartTime();
			break;
		default:
			daily_wage=0;
			break;
		}
		calculateMonthly(daily_wage);
	}
	private static void isPresent() {
		double is_present=Math.random();
		if(is_present<.5)
			System.out.println("Employee is absent");
		else
			System.out.println("Employee is present");
	}
	private static long calculateDailyWage() {
		int daily_wage_per_hour=20, no_of_hours=8;
		long daily_wage=daily_wage_per_hour*no_of_hours;
		System.out.println("Daily wage of employee = "+daily_wage);
		return daily_wage;
	}
	private static long calculatePartTime() {
		int part_time_hours=8, part_time_wage_per_hour=20;
		long part_time_wage=part_time_hours*part_time_wage_per_hour;
		System.out.println("Part Time wage of employee");
		return part_time_wage;
	}
	private static void calculateMonthly(long daily_wage) {
		int no_of_days=20;
		long monthly_salary=daily_wage*no_of_days;
		System.out.println("Monthly Salary = "+monthly_salary);
	}
	private static void calculateWageConditional(int no_of_hours) {
		int wage_per_hour=20;
		int monthly_wage_conditional;
		if(no_of_hours>100)
			monthly_wage_conditional=wage_per_hour*100;
		else
			monthly_wage_conditional=wage_per_hour*no_of_hours;
			
		System.out.println("Monthly Wage is "+monthly_wage_conditional);
	}
}
