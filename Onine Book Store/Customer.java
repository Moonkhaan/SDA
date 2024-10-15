// Customer.java
import java.util.List;

public class Customer {
    private String name;
    private ShoppingCart cart;
    private PaymentGateway paymentGateway;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart();
        this.paymentGateway = new PaymentGateway();
    }

    public void browseBooks(List<Book> availableBooks) {
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }

    public void addToCart(Book book) {
        cart.addBook(book);
    }

    public void checkout() {
        double total = cart.calculateTotal();
        if (paymentGateway.processPayment(total)) {
            Order order = new Order(cart.getBooks(), total);
            order.confirmOrder();
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
}
