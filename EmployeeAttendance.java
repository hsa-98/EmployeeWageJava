class EmployeeAttendance{
	static final int IsPresent = 1;
	static final int IsPartTime = 2;
	static final int WagePerHour = 20;

	public static void main(String args[]){
		System.out.println("Welcome to wage computation problem");
		int totalDays = 0;
		int totalSalary = 0;
		while(totalDays <=20) {
			double check = Math.floor(Math.random() * 10) % 3;
			switch ((int) check) {
				case IsPresent:
					int NumOfHours = 8;
					System.out.println("Employee is present");
					int empWage = WagePerHour * NumOfHours;
					System.out.println("The wage of the employee is:" + empWage);
					totalDays++;
					totalSalary+=empWage;
					break;

				case IsPartTime:
					System.out.println("Employee is present part time");
					NumOfHours = 4;
					empWage = WagePerHour * NumOfHours;
					System.out.println("The wage of the employee is:" + empWage);
					totalDays++;
					totalSalary+=empWage;
					break;

				case 0:
					System.out.println("Employee is absent");
					totalDays++;
					break;
			}
		}
		System.out.println("The total wage of employee after 20 working days is: " +totalSalary);
	}
}

