package controller;

import modal.book.Book;
import modal.book.BusinessBook;
import modal.book.FictionBook;
import modal.book.ProgramingBook;
import modal.interfaces.CRUD;
import modal.interfaces.InSearchSort;
import modal.interfaces.RealMoney;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager implements CRUD<Book>,InSearchSort<Book>, RealMoney {

    private List<Book> books;
    private Scanner scanner = new Scanner(System.in);
    public BookManager() {
        books = new ArrayList<>();
        books.add(new FictionBook(1,"Đỏ trỗi dậy","Lê Đình Chi",20,102.000,"English"));
        books.add(new FictionBook(2,"Hai vạn dặm dưới đáy biện","Jules Verne",15,81.600,"Tiếng Việt"));
        books.add(new FictionBook(3,"Người minh họa","Ray Bradbury",10,100.000,"English"));
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
    public void insert(Book list, int index) {

    }

    @Override
    public void search(Book list, String name) {

    }

    @Override
    public void sort() {

    }
    @Override
    public void getRealMoney() {
    }
    public List<Book> getListBook() {
        return books;
    }
}
