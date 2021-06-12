class EmployeeAttendance{
	static final int IsPresent = 1;
	static final int WagePerHour = 20;
	static final int NumOfHours = 8;
	public static void main(String args[]){
		System.out.println("Welcome to wage computation problem");	
		double check = Math.floor(Math.random()* 10) % 2;
		if(check == IsPresent){
			System.out.println("Employee is present");
			int empWage = WagePerHour*NumOfHours;
			System.out.println("The wage of the employee is:"+empWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
