package modal.book;

import java.io.Serializable;

public abstract class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private int quantity;
    private double price;

    public Book() {

    }

    public Book(int id,String title, String author, int quantity, double price) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + ", id=" + id + ", title='" + title + '\'' + ", author='" + author + '\'' + ", quantity=" + quantity + ", price=" + price + '}';
    }
}
