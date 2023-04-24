package modal.book;

import java.io.Serializable;

public class BusinessBook extends Book implements Serializable,Comparable<BusinessBook>{
    private String origin;

    public BusinessBook() {
    }

    public BusinessBook(int id,String title, String author, int quantity, double price, String origin) {
        super(id,title, author, quantity, price);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "BusinessBook{" +
                "origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int compareTo(BusinessBook o) {
        return (int)(this.getPrice() - o.getPrice());
    }
}
