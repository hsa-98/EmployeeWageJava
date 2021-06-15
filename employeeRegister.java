/**
 *employeeRegister- class to make an object of employee
 * @author Harsh
 *
 */
public class employeeRegister {
    /**
     * employee: The method creates and object and has logic,
     * to compute the monthly salary of employee based on attendance
     */
    public static void employee(){
        EmployeeAttendance employee =new EmployeeAttendance();
        while(employee.totalDays <=20 || employee.totalHours<=100) {
            double check = Math.floor(Math.random() * 10) % 3;
            if (check == employee.IsPresent) {
                employee.ifPresent();
            } else if (check == employee.IsPartTime) {
                employee.ifParttime();
            } else {
                System.out.println("Employee is absent");
            }

            if (employee.totalDays + 1 > 100 || employee.totalHours + 4 > 100) {
                break;
            }
        }
        System.out.println("Total hours worked are: " +employee.totalHours);
        System.out.println("Total days worked are: " +employee.totalDays);
        System.out.println("The total wage of employee after 20 working days or 100 hours is: " +employee.totalSalary);


    }
    public static void main(String args[]){
        employee();

    }
}
