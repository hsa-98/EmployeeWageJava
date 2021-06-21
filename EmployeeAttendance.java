/**
 *EmployeeAttendance: This class handles all the methods related to employee wage
 * @author Harsh
 */
class EmployeeAttendance {
	//constants
	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;
	int [] dailyWage ;
	int totalDays = 0, totalSalary = 0, totalHours = 0, wagePerHour = 0,totalHoursAllowed = 0,totalDaysAllowed=0 ; //variables
	String companyName;
	EmployeeAttendance(String name, int WagePerHour,int totalHoursAllowed, int totalDaysAllowed){
		this.companyName=name;
		this.wagePerHour=WagePerHour;
		this.totalHoursAllowed = totalHoursAllowed;
		this.totalDaysAllowed = totalDaysAllowed;
		this.dailyWage = new int[totalDaysAllowed];

	}

	/**
	this method calculates the employee wage
	 */
	public  int dailyWageCalc(int hours) {
		int wage = hours * wagePerHour;
		return wage;
	}

	/**
	This method is called if employee is present
	 */
	public void ifPresent() {

		int NumOfHours = 8;
		int empWage = dailyWageCalc(NumOfHours);
		increment(empWage, NumOfHours);

		return;
	}

	/**
	this method is called if employee is part time present
	 */
	public void ifParttime() {
		int NumOfHours = 4;
		int empWage = dailyWageCalc(NumOfHours);
		increment(empWage, NumOfHours);
		return;
	}
	/**
	this method increments the necessary values
	 */
	public void increment(int empWage, int NumOfHours) {
		dailyWage[totalDays] = empWage;
		totalDays++;
		totalSalary += empWage;
		totalHours += NumOfHours;
		return;
	}
}



