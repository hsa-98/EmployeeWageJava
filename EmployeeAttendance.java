class EmployeeAttendance{
	static final int IsPresent = 1;
	static final int IsPartTime = 2;
	static final int WagePerHour = 20;

	public static void main(String args[]){
		System.out.println("Welcome to wage computation problem");	
		double check = Math.floor(Math.random()* 10) % 3;
		if(check == IsPresent){
			final int NumOfHours = 8;
			System.out.println("Employee is present");
			int empWage = WagePerHour*NumOfHours;
			System.out.println("The wage of the employee is:"+empWage);
		}
		else if(check == IsPartTime){
			System.out.println("Employee is present part time");
			final int NumOfHours = 4;
			int empWage = WagePerHour*NumOfHours;
			System.out.println("The wage of the employee is:"+empWage);


		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
