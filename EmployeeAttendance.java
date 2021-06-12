class EmployeeAttendance{
	static final int IsPresent=1;
	public static void main(String args[]){
		System.out.println("Welcome to wage computation problem");	
		double check = Math.floor(Math.random()* 10) % 2;
		if(check == IsPresent){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
