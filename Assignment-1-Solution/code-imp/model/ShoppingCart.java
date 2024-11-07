// ShoppingCart.java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<BookGui> books;

    public ShoppingCart() {
        this.books = new ArrayList<>();
    }

    public void addBook(BookGui book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (BookGui book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public List<BookGui> getBooks() {
        return books;
    }
}
