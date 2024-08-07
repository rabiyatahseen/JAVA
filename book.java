// Define the Book class
class Book {
    String title;
    String author;
    double price;

    // Constructor to initialize the attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

// Main class to demonstrate object manipulation
public class Main {
    // Method to display book information
    public static void displayBookInfo(Book book) {
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: $" + book.price);
    }

    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book("Effective Java", "Joshua Bloch", 45.00);

        // Call the method to display the book's information
        displayBookInfo(myBook);
    }
}
