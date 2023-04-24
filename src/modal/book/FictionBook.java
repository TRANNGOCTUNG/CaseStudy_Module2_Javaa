package modal.book;

import java.io.Serializable;

public class FictionBook extends Book implements Serializable,Comparable<FictionBook> {
    private String category;

    public FictionBook() {
    }

    public FictionBook(int id,String title, String author, int quantity, double price, String category) {
        super(id,title, author, quantity, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return   super.toString()+
                "FictionBook{" +
                "category='" + category + '\'' +
                '}';
    }

    @Override
    public int compareTo(FictionBook o) {
        return this.getAuthor().compareTo(o.getAuthor());
    }
}
