// Order.java
import java.util.List;

public class Order {
    private List<BookGui> books;
    private double totalAmount;

    public Order(List<BookGui> books, double totalAmount) {
        this.books = books;
        this.totalAmount = totalAmount;
    }

    public void confirmOrder() {
        System.out.println("Order confirmed. Total amount: $" + totalAmount);
        // Logic to send receipt to customer could go here
    }
}
