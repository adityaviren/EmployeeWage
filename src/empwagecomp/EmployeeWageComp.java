package empwagecomp;

import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		double is_present=Math.random();
		String message = (is_present < 0.5) ? "Employee is present" : "Employee is absent" ;
	}
}
