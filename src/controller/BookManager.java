package controller;

import Storage.ReadWriteFile;
import modal.book.Book;
import modal.book.BusinessBook;
import modal.book.FictionBook;
import modal.book.ProgramingBook;
import modal.interfaces.CRUD;
import modal.interfaces.SearchSort;
import modal.interfaces.RealMoney;
import modal.person.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class BookManager implements CRUD<Book>, SearchSort<Book>, RealMoney {
    private ReadWriteFile<Book> readWriteFile = ReadWriteFile.getINSTANCE();
    private List<Book> books;
    private Scanner scanner = new Scanner(System.in);
    public BookManager() {
        books = new ArrayList<>();
        books.add(new FictionBook(1,"Đỏ trỗi dậy","Lê Đình Chi",20,102.000,"Viễn tưởng 1"));
        books.add(new FictionBook(2,"Hai vạn dặm dưới đáy biện","Jules Verne",15,81.600,"Viễn tưởng 2"));
        books.add(new FictionBook(3,"Người minh họa","Ray Bradbury",10,100.000,"Viễn tưởng 1"));
        books.add(new ProgramingBook(4,"Java căn bản","Pham Văn Trung",20,95.000,"Java"));
        books.add(new ProgramingBook(5,"Lập trình Java ","Trần Phú Tài",20,105.000,"Java"));
        books.add(new ProgramingBook(6,"Lập trình Python","Trần Văn Đạt",15,80.000,"Python"));
        books.add(new BusinessBook(7,"Tuyệt kỹ bán hàng","Xuân Chi Dịch",17,30.000,"Việt Nam"));
        books.add(new BusinessBook(8,"Nghĩ giàu và làm giàu","NaPoLeOn Hill",10,200.000,"USA"));
        books.add(new BusinessBook(9,"Đọc vị bất kì ai","Xuân Chi Dịch",12,90.000,"Việt Nam"));
    }
    @Override
    public void add(Book value) {
        books.add(value);

    }
    @Override
    public void display() {
        for (Book b:books
             ) {
            System.out.println(b);
        }
    }
    @Override
    public void edit(Book value) {
        System.out.println("Enter index edit:");
        int index = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if(i == index){
                books.set(i,value);
                break;
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter index delete:");
        int index = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if(i == index){
                books.remove(i);
            }
        }
    }
    @Override
    public void search(List<Book> list,String name) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equals(name)){
                System.out.println(name + " getTile " + " index : " + i );
            } else {
                System.out.println("Can not found: ");
            }
        }
    }
    @Override
    public void sort() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
    }
    public void sortTitle() {
        Collections.sort(books, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }
    @Override
    public void getRealMoney() {
        double total = 0;
        for (Book book: books
        ) {
            total += book.getPrice();
        }
        System.out.println("Total money book: " + total + " VND ");

    }
    public List<Book> getListBook() {
        return books;
    }
    public void readData(String path){
        readWriteFile.readFile(path);
    }
    public void writeData(List<Book> value,String path) {
        readWriteFile.writeFile(books,path);
    }
    public int totalCategory(List<Book> list,String category){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof FictionBook) {
                if(((FictionBook) list.get(i)).getCategory().equals(category)){
                    total++;
                }
            }
        }
        return total;
    }
    public int totalLanguage(List<Book> list,String language){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof ProgramingBook){
                if(((ProgramingBook) list.get(i)).getLanguage().equals(language)){
                    total ++;
                }
            }
        }
        return total;
    }
    public int totalOriginal(List<Book> list,String original){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof BusinessBook){
                if(((BusinessBook) list.get(i)).getOrigin().equals(original)){
                    total ++;
                }
            }
        }
        return total;
    }
}
