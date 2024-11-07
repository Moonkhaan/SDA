// Book.java
public class BookGui {
    private String title;
    private String author;
    private double price;

    public BookGui(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " - $" + price;
    }
}