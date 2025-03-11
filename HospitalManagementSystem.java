class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital Name: " + hospitalName);
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Ajay", 30, "Fever");
        Patient patient2 = new Patient(2, "Suresh", 45, "Cold");

        patient1.displayDetails();
        System.out.println("---------------------");
        patient2.displayDetails();
        System.out.println("---------------------");
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}

// SampleOutput
//Patient ID: 1
//Name: Ajay
//Age: 30
//Ailment: Fever
//Hospital Name: City Hospital
//---------------------
//Patient ID: 2
//Name: Suresh
//Age: 45
//Ailment: Cold
//Hospital Name: City Hospital
//---------------------
//Total Patients Admitted: 2