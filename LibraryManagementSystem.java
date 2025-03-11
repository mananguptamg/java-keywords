// Book class to represent library books
class Book {
    // Static variable for library name
    public static String libraryName = "City Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable for unique book identifier

    // Constructor using 'this' keyword
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Book Details - Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display library name
        Book.displayLibraryName();

        // Create and display book instances
        Book book1 = new Book("Core Java", "James Goshling", "978-01");
        Book book2 = new Book("Advance Java", "Goshling James", "978-02");

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}

//Sample Output
//Library Name: City Library
//Book Details - Title: Core Java, Author: James Goshling, ISBN: 978-01
//Book Details - Title: Advance Java, Author: Goshling James, ISBN: 978-02