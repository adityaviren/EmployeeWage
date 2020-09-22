package empwagecomp;

public class EmployeeWageComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
		isPresent();
		calculateDailyWage();
		calculatePartTime();
	}
	private static void isPresent() {
		double is_present=Math.random();
		if(is_present<.5)
			System.out.println("Employee is absent");
		else
			System.out.println("Employee is present");
	}
	private static void calculateDailyWage() {
		int daily_wage_per_hour=20, no_of_hours=8;
		long daily_wage=daily_wage_per_hour*no_of_hours;
		System.out.println("Daily wage of employee = "+daily_wage);
	}
	private static void calculatePartTime() {
		int part_time_hours=8, part_time_wage_per_hour=20;
		long part_time_wage=part_time_hours*part_time_wage_per_hour;
		System.out.println("Part Time wage of employee");
	}

}
