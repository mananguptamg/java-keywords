class Vehicle {
    private static double registrationFee; // Static variable
    private final String registrationNumber; // Final variable
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    // Method to display vehicle details
    public void displayDetails() {
        if (this instanceof Vehicle) { // instanceof check
            System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                    ", Registration Number: " + registrationNumber +
                    ", Registration Fee: " + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Update registration fee
        Vehicle.updateRegistrationFee(5000);

        // Create vehicle objects
        Vehicle car = new Vehicle("Ajay", "Car", "1234");
        Vehicle bike = new Vehicle("Suresh", "Bike", "4567");

        // Display vehicle details
        car.displayDetails();
        bike.displayDetails();
    }
}

// SampleOutput
//Owner: Ajay, Vehicle Type: Car, Registration Number: 1234, Registration Fee: 5000.0
//Owner: Suresh, Vehicle Type: Bike, Registration Number: 4567, Registration Fee: 5000.0

