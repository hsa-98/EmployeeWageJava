import java.util.HashMap;
import java.util.Scanner;

/**
 * employeeRegister- class to make an object of employee
 *
 * @author Harsh
 */
public class employeeRegister {

    HashMap<String,EmployeeAttendance>hashMap = new HashMap<String,EmployeeAttendance>();
    static Scanner sc = new Scanner(System.in);
    /**
     * employee: The method creates and object and has logic,
     * to compute the monthly salary of employee based on attendance
     */
    public void employee(String name, int totalHours, int wage, int totalDays) {

        EmployeeAttendance employee = new EmployeeAttendance(name, wage,totalHours,totalDays);
        hashMap.put(name,employee);

        while (employee.totalDays <= totalDays || employee.totalHours <= totalHours) {

            double check = Math.floor(Math.random() * 10) % 3;

            if (check == employee.IS_PRESENT) {
                employee.ifPresent();
            } else if (check == employee.IS_PART_TIME) {
                employee.ifParttime();
            } else {

            }

        }
        System.out.println("Company: " + name);
        System.out.println("Total hours worked are: " + employee.totalHours);
        System.out.println("Total days worked are: " + employee.totalDays);
        System.out.println("The total wage of employee is " + employee.totalSalary);
        return;


    }

    /**
     * company: This method takes company name and other parameters like company hour,days,wage.
     */
    public  void company() {

        System.out.println("Enter Company name");
        String name = sc.next();
        System.out.println("Enter wage");
        int wage = sc.nextInt();
        System.out.println("Enter total hours");
        int hours = sc.nextInt();
        System.out.println("Enter total  days");
        int days = sc.nextInt();
        employee(name,hours,wage,days);
        return;


    }

    public static void main(String args[]) {
        employeeRegister employeeRegister = new employeeRegister();
        int choice = 0;
        while(choice!=4) {
            System.out.println("1)Create a company and calculate employee wage");
            System.out.println("2)Check a companies total employee wage ");
            System.out.println("3)Check daily wage along with total wage");
            System.out.println("4)Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    employeeRegister.company();
                    break;
                case 2:
                    System.out.println("Enter the name of the company");
                    String name = sc.next();
                    if (employeeRegister.hashMap.containsKey(name)){
                        EmployeeAttendance obj = employeeRegister.hashMap.get(name);
                        int totalWage= obj.totalSalary;
                        System.out.println("The total Salary is:"+totalWage);
                    }
                    break;
                case 3:
                    System.out.println("Enter the name of the company");
                    String name1 = sc.next();
                    if (employeeRegister.hashMap.containsKey(name1)) {
                        EmployeeAttendance obj1 = employeeRegister.hashMap.get(name1);
                        int totalWage1 = obj1.totalSalary;
                        int [] dailyWage = obj1.dailyWage;
                        System.out.println("The total Salary is:" + totalWage1);
                        System.out.println("The daily wage of employee is:");
                        for(int i = 0;i < dailyWage.length;i++)
                        System.out.print(dailyWage[i]+" ");
                    }
                    break;
            }
        }

    }
}
