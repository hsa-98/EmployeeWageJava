import java.util.Scanner;

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
    public static void employee(String name, int totalHours, int wage,int totalDays){
        EmployeeAttendance employee =new EmployeeAttendance(name,wage);
        while(employee.totalDays <=totalDays || employee.totalHours<=totalHours) {
            double check = Math.floor(Math.random() * 10) % 3;
            if (check == employee.IS_PRESENT) {
                employee.ifPresent();
            } else if (check == employee.IS_PART_TIME) {
                employee.ifParttime();
            } else {

            }

            if (employee.totalDays + 1 > totalDays || employee.totalHours + 4 > totalHours) {
                break;
            }
        }
        System.out.println("Company: "+name);
        System.out.println("Total hours worked are: " +employee.totalHours);
        System.out.println("Total days worked are: " +employee.totalDays);
        System.out.println("The total wage of employee is " +employee.totalSalary);
        return;


    }

    /**
     * company: This method takes company name and other parameters like company hour,days,wage.
     */
    public static void company(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of companies");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter Company name");
            String name = sc.next();
            System.out.println("Enter wage");
            int wage = sc.nextInt();
            System.out.println("Enter hours");
            int hours = sc.nextInt();
            System.out.println("Enter days");
            int days = sc.nextInt();
            employee(name, hours, wage, days);
        }



    }
    public static void main(String args[]){
        company();

    }
}
