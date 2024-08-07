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


// Define the Rectangle class
class Rectangle {
    double length;
    double width;

    // Constructor to initialize the attributes
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// Main class to demonstrate object state modification
public class Main {
    // Method to resize the rectangle
    public static void resizeRectangle(Rectangle rect, double newLength, double newWidth) {
        rect.length = newLength;
        rect.width = newWidth;
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Print original dimensions
        System.out.println("Original Dimensions: Length = " + myRectangle.length + ", Width = " + myRectangle.width);

        // Call the method to resize the rectangle
        resizeRectangle(myRectangle, 10.0, 6.0);

        // Print resized dimensions
        System.out.println("Resized Dimensions: Length = " + myRectangle.length + ", Width = " + myRectangle.width);
    }
}

