// Product class to manage shopping cart items
class Product {
    // Static variable for discount shared by all products
    private static double discount = 0.0;

    // Final variable for unique product ID
    private final int productID;

    // Instance variables for product details
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' for initialization
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to display product details including the discount
    public void displayDetails() {
        System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: " + price
                + ", Quantity: " + quantity + ", Discount: " + discount + "%");
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create Product objects and demonstrate functionality
        Product product1 = new Product(101, "Laptop", 50000, 1);
        Product product2 = new Product(102, "Smartphone", 15000, 2);

        // Check if objects are instances of Product
        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        if (product2 instanceof Product) {
            product2.displayDetails();
        }

        // Update discount for all products
        Product.updateDiscount(10);

        System.out.println("-------------------------------------------------------------------------");
        // Check if objects are instances of Product
        if (product1 instanceof Product) {
            product1.displayDetails();
        }

        if (product2 instanceof Product) {
            product2.displayDetails();
        }
    }
}

//SampleOutput
//Product ID: 101, Name: Laptop, Price: 50000.0, Quantity: 1, Discount: 0.0%
//Product ID: 102, Name: Smartphone, Price: 15000.0, Quantity: 2, Discount: 0.0%
//        -------------------------------------------------------------------------
//Product ID: 101, Name: Laptop, Price: 50000.0, Quantity: 1, Discount: 10.0%
//Product ID: 102, Name: Smartphone, Price: 15000.0, Quantity: 2, Discount: 10.0%