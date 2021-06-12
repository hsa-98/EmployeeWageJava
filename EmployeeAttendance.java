class EmployeeAttendance{
	static final int IsPresent = 1;
	static final int IsPartTime = 2;
	static final int WagePerHour = 20;

	public static void main(String args[]){
		System.out.println("Welcome to wage computation problem");
		int totalDays = 0;
		int totalSalary = 0;
		int totalHours = 0;
		while(totalDays <=20 && totalHours<=100  ) {
			double check = Math.floor(Math.random() * 10) % 3;
			switch ((int) check) {
				case IsPresent:

					int NumOfHours = 8;
					if(totalDays+1>100 || totalHours+NumOfHours>100){
						break;
					}
					int empWage = WagePerHour * NumOfHours;
					System.out.println("Employee is present");
					System.out.println("The wage of the employee is:" + empWage);
					totalDays++;
					totalSalary+=empWage;
					totalHours+=NumOfHours;
					break;

				case IsPartTime:
					System.out.println("Employee is present part time");
					NumOfHours = 4;
					empWage = WagePerHour * NumOfHours;
					System.out.println("The wage of the employee is:" + empWage);
					totalDays++;
					totalSalary+=empWage;
					totalHours+=NumOfHours;
					break;

				case 0:
					System.out.println("Employee is absent");
					break;
			}
			if(totalDays+1>100 || totalHours+4>100){
				break;
			}
		}
		System.out.println("Total hours worked are: " +totalHours);
		System.out.println("Total days worked are: " +totalDays);
		System.out.println("The total wage of employee after 20 working days or 100 hours is: " +totalSalary);
	}
}

