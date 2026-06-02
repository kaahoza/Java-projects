import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int employeeIdCounter = 1;

        while (true)  {
            System.out.println("Employee Attendance Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit Attendance");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter employee's name");
                    String name = sc.nextLine();
                    System.out.println("Enter employee's lastname");
                    String lastname = sc.nextLine();
                    employees.add(new Employee(employeeIdCounter, name, lastname));
                    employeeIdCounter++;
                    System.out.println("Employee added successfully");
                    break;
                case 2:
                    System.out.println("Enter employee Id to mark attendance");
                    int employeeId = sc.nextInt();
                    Employee employee = findEmployeeById(employees, employeeId);

                    if (employee != null) {
                        employee.markAttendance();;
                        System.out.println("Attendance marked for " +employee.getName());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter employee Id to view Attendance:");
                    int idToView= sc.nextInt();
                    Employee employeeToView = findEmployeeById(employees, idToView);
                    if (employeeToView != null) {
                        List<String> attendance = employeeToView.getAttendance();
                        if (attendance.isEmpty()) {
                            System.out.println(employeeToView.getAttendance() + "has no attendance record");
                        } else {
                            System.out.println("Attendance record for " + employeeToView.getName() + ":");
                            for (String record : attendance) {
                                System.out.println(record);
                            }
                        }
                    } else  {
                            System.out.println("Employee not found");
                        }
                    break;

                case 4:
                    System.out.print("Exiting the employee attendance system");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.print("Invalid Selection, please select 1, 2, 3, or 4 " + " " );
                    }
            }
        }

    private static Employee findEmployeeById(List<Employee> employees, int id) {

        for (Employee employee: employees) {
            if (employee.getId() == employee.id) {
                return employee;
            }
        } return null;
    }
}