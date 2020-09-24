package empwagecomp;

import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		double is_present=Math.random();
		if(is_present<.5)
			System.out.println("Employee is absent");
		else
			System.out.println("Employee is present");
	}
}
