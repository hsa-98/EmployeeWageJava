/**
 *EmployeeAttendance: This class handles all the methods related to employee wage
 * @author Harsh
 */
class EmployeeAttendance {
	//constants
	static final int IsPresent = 1;
	static final int IsPartTime = 2;
	static final int WagePerHour = 20;
	int totalDays = 0, totalSalary = 0, totalHours = 0; //variables

	/*
	this method calculates the employee wage
	 */
	public static int dailyWageCalc(int hours) {
		int wage = hours * WagePerHour;
		return wage;
	}

	/**
	This method is called if employee is present
	 */
	public void ifPresent() {

		int NumOfHours = 8;
		if (totalDays + 1 > 100 || totalHours + NumOfHours > 100) {
			return;
		}
		int empWage = dailyWageCalc(NumOfHours);
		System.out.println("Employee is present");
		System.out.println("The wage of the employee is:" + empWage);
		increment(empWage, NumOfHours);

		return;
	}

	/**
	this method is called if employee is part time present
	 */
	public void ifParttime() {
		System.out.println("Employee is present part time");
		int NumOfHours = 4;
		int empWage = dailyWageCalc(NumOfHours);
		System.out.println("The wage of the employee is:" + empWage);
		increment(empWage, NumOfHours);
		return;
	}
	/**
	this method increments the necessary values
	 */
	public void increment(int empWage, int NumOfHours) {
		totalDays++;
		totalSalary += empWage;
		totalHours += NumOfHours;
		return;
	}
}



