package modal.book;

import java.io.Serializable;

public class ProgramingBook extends Book implements Serializable,Comparable<ProgramingBook> {
    private String Language;

    public ProgramingBook() {

    }

    public ProgramingBook(int id,String title, String author, int quantity, double price, String language) {
        super(id,title, author, quantity, price);
        Language = language;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "ProgramingBook{" +
                "Language='" + Language + '\'' +
                '}';
    }

    @Override
    public int compareTo(ProgramingBook o) {
        return this.getQuantity() - o.getQuantity();
    }
}
