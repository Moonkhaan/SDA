// Main.java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample books
        List<Book> availableBooks = Arrays.asList(
                new Book("Effective Java", "Joshua Bloch", 45.0),
                new Book("Clean Code", "Robert C. Martin", 40.0),
                new Book("Design Patterns", "Erich Gamma", 50.0)
        );

        Customer customer = new Customer("Muneeb");
        customer.browseBooks(availableBooks);
        
        // Simulate adding books to cart and checking out
        customer.addToCart(availableBooks.get(0)); // Adding "Effective Java"
        customer.addToCart(availableBooks.get(1)); // Adding "Clean Code"
        customer.checkout();
    }
}