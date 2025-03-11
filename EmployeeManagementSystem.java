class Employee {
    private static String companyName = "Technical Innovation";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this' to initialize fields
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee instances
        Employee emp1 = new Employee(1, "Ajay", "Front-end Developer");
        Employee emp2 = new Employee(2, "Arun", "Back-end Developer");

        // Display employee details if they are instances of Employee
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

        // Display total employees
        Employee.displayTotalEmployees();
    }
}

//SampleOutput
//ID: 1, Name: Ajay, Designation: Front-end Developer
//ID: 2, Name: Arun, Designation: Back-end Developer
//Total Employees: 2