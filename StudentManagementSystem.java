class Student {
    // Static variable shared across all students
    private static String universityName = "Engineering College of India";
    private static int totalStudents = 0;

    // Final variable for roll number
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
        }
    }

    // Method to update grade
    public void updateGrade(String grade) {
        if (this instanceof Student) {
            this.grade = grade;
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        // Create student instances
        Student student1 = new Student("Manan", 101, "A");
        Student student2 = new Student("Naman", 102, "B");

        // Display student details
        student1.displayDetails();
        student2.displayDetails();

        // Update student grade
        student2.updateGrade("A+");

        // Display updated details
        student2.displayDetails();

        // Display total number of students
        Student.displayTotalStudents();
    }
}

//SampleOutput
//Name: Manan, Roll Number: 101, Grade: A
//Name: Naman, Roll Number: 102, Grade: B
//Name: Naman, Roll Number: 102, Grade: A+
//Total Students Enrolled: 2