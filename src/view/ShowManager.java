package view;

import controller.BookManager;
import controller.CustomerManager;
import login.RegexUser;
import modal.book.Book;
import modal.book.BusinessBook;
import modal.book.FictionBook;
import modal.book.ProgramingBook;
import modal.person.Customer;
import modal.person.Person;

import java.util.List;
import java.util.Scanner;

public class ShowManager {
    public CustomerManager customerManager = new CustomerManager();
    public List<Person> person = customerManager.getListPerson();
    public BookManager bookManager = new BookManager();
    public List<Book> books = bookManager.getListBook();
    public Scanner scanner = new Scanner(System.in);
    public RegexUser userName = new RegexUser();
    public Person addCustomer() {
        try {
            System.out.println("Enter name customer: ");
            String name = scanner.nextLine();
            System.out.println("Enter age customer: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter address customer: ");
            String address = scanner.nextLine();
            System.out.println("Enter phone customer: ");
            String phone = scanner.nextLine();
            Customer customer = new Customer(name, age, address, phone);
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Person editCustomer() {
        try {
            System.out.println("Edit name customer: ");
            String name = scanner.nextLine();
            System.out.println("Edit age customer: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Edit address customer: ");
            String address = scanner.nextLine();
            System.out.println("Edit phone customer: ");
            String phone = scanner.nextLine();
            Customer customer = new Customer(name, age, address, phone);
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Book addBook() {
        System.out.println("""
                Menu.
                1.Add FictionBook
                2.Add ProgrammesBook
                3.Add BusinessBook
                """);
        System.out.println("Enter choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> {
                try {
                    System.out.println("Enter id fictionBook: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter title fictionBook: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter author fictionBook: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter quantity fictionBook: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter price fictionBook: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter category fictionBook: ");
                    String category = scanner.nextLine();
                    FictionBook fictionBook = new FictionBook(id, title, author, quantity, price, category);
                    return fictionBook;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case 2 -> {
                try {
                    System.out.println("Enter id programingBook : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter title programingBook: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter author programingBook: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter quantity programingBook: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter price programingBook: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter language programingBook: ");
                    String language = scanner.nextLine();
                    ProgramingBook programingBook = new ProgramingBook(id, title, author, quantity, price, language);
                    return programingBook;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case 3 -> {
                try {
                    System.out.println("Enter id businessBook : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter title businessBook: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter author businessBook: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter quantity businessBook: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter price businessBook: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter origin businessBook: ");
                    String origin = scanner.nextLine();
                    BusinessBook businessBook = new BusinessBook(id, title, author, quantity, price, origin);
                    return businessBook;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            default -> System.out.println("Can not find book: ");
        }
        return null;
    }

    public Book editBook() {
        System.out.println("""
                Menu.
                1.Edit FictionBook
                2.Edit ProgrammesBook
                3.Edit BusinessBook
                """);

        System.out.println("Enter choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> {
                try {
                    System.out.println("Edit id fictionBook: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit title fictionBook: ");
                    String title = scanner.nextLine();
                    System.out.println("Edit author fictionBook: ");
                    String author = scanner.nextLine();
                    System.out.println("Edit quantity fictionBook: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit price fictionBook: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Edit category fictionBook: ");
                    String category = scanner.nextLine();
                    FictionBook fictionBook = new FictionBook(id, title, author, quantity, price, category);
                    return fictionBook;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case 2 -> {
                try {
                    System.out.println("Edit id programingBook : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit title programingBook: ");
                    String title = scanner.nextLine();
                    System.out.println("Edit author programingBook: ");
                    String author = scanner.nextLine();
                    System.out.println("Edit quantity programingBook: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit price programingBook: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Edit language programingBook: ");
                    String language = scanner.nextLine();
                    ProgramingBook programingBook = new ProgramingBook(id, title, author, quantity, price, language);
                    return programingBook;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case 3 -> {
                try {
                    System.out.println("Edit id businessBook : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit title businessBook: ");
                    String title = scanner.nextLine();
                    System.out.println("Edit author businessBook: ");
                    String author = scanner.nextLine();
                    System.out.println("Edit quantity businessBook: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit price businessBook: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Edit origin businessBook: ");
                    String origin = scanner.nextLine();
                    BusinessBook businessBook = new BusinessBook(id, title, author, quantity, price, origin);
                    return businessBook;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            default -> System.out.println("Can not find book: ");
        }
        return null;
    }

    public void totalLanguagesBook() {
        int choice;
        do {
            System.out.println("""
                    Menu.
                    1.Total category fictionBook.
                    2.Total language programingBook
                    3.Total origin businessBook.
                    0.Exit.
                    """);
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    try {
                        System.out.println("Enter language: ");
                        String language = scanner.nextLine();
                        System.out.println("Total book language Viễn Tưởng 1  FictionBook is: " + bookManager.totalCategory(books, language));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Enter language: ");
                        String language = scanner.nextLine();
                        System.out.println("Total book language Java ProgramingBook is: " + bookManager.totalLanguage(books, language));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Enter language: ");
                        String language = scanner.nextLine();
                        System.out.println("Total book language Việt Nam BusinessBook is: " + bookManager.totalOriginal(books, language));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                case 0 -> {
                }
            }
        } while (choice != 0);
    }

    public void displayCustomer() {
        int choice;
        do {
            System.out.println("""
                    Menu.
                    1.Display Customer.
                    2.Display Book.
                    3.Read name customer files.
                    0.Exit.
                    """);
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    customerManager.display();
                }
                case 2 -> {
                    bookManager.display();
                }
                case 3 -> {
                    customerManager.readData("src/file/customer.dat");
                }
                case 0 ->{
                }
            }
        } while (choice != 0);
    }

    public void managerBook() {
        ShowManager showManager = new ShowManager();
        int choice;
        do {
            System.out.println("""
                    Menu
                    1.Add Book.
                    2.Display Book.
                    3.Edit Book.
                    4.Delete Book.
                    5.Search Book.
                    6.SortAuthor Book.
                    7.SortTitle Book.
                    8.RealMoney Book.
                    9.Total Language Book.
                    10.Save Book.
                    11.Read Book.
                    0.Exit.                   
                    """);
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    bookManager.add(addBook());
                }
                case 2 -> {
                    bookManager.display();
                }
                case 3 -> {
                    bookManager.edit(editBook());
                }
                case 4 -> {
                    bookManager.delete();
                }
                case 5 -> {
                    System.out.println("Enter name book: ");
                    String name = scanner.nextLine();
                    bookManager.search(books, name);
                }
                case 6 -> {
                    bookManager.sort();
                }
                case 7 -> {
                    bookManager.sortTitle();
                }
                case 8 -> {
                    bookManager.getRealMoney();
                }
                case 9 -> {
                    showManager.totalLanguagesBook();
                }
                case 10 -> {
                    bookManager.writeData(books, "src/file/book.dat");
                }
                case 11 -> {
                    bookManager.readData("src/file/book.dat");
                }
                case 0 -> {
                }

            }

        } while (choice != 0);

    }

    public void manageCustomer() {
        int choice;
        do {
            System.out.println("""
                    Menu.
                    1.Add Customer
                    2.Display Customer.
                    3.Edit Customer.
                    4.Delete Customer.
                    5.Search Customer.
                    6.Sort Customer.
                    7.Save Files
                    8.Read Files
                    0.Exit.
                    """);
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    customerManager.add(addCustomer());
                }
                case 2 -> {
                    customerManager.display();
                }
                case 3 -> {
                    customerManager.edit(editCustomer());
                }
                case 4 -> {
                    customerManager.delete();
                }
                case 5 -> {
                    System.out.println("Enter name customer search:");
                    String name = scanner.nextLine();
                    customerManager.search(person, name);
                }
                case 6 -> {
                    customerManager.sortAge();
                }
                case 7 -> {
                    customerManager.writeData(person, "src/file/customer.dat");
                }
                case 8 -> {
                    customerManager.readData("src/file/customer.dat");
                }
                case 0 -> {
                }
            }
        } while (choice != 0);
    }

    public void showManagement() {
        ShowManager showManager = new ShowManager();
        int choice;
        int choice1;
            do {
                System.out.println("""
                    Menu.
                    1.Are you the manager
                    2.You are the customer                  
                    0.Exit.
                    """);
                System.out.println("Enter choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        do {
                            System.out.println("""
                                    Menu.
                                    1.managerBook
                                    2.managerCustomer
                                    0.Exit
                                    """);
                            System.out.println("Enter choice: ");
                            choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1) {
                                case 1 -> {
                                    showManager.managerBook();
                                }
                                case 2 -> {
                                    showManager.manageCustomer();
                                }
                                case 0 -> {
                                }
                            }
                        } while (choice1 != 0);
                    }
                    case 2 -> {
                        showManager.displayCustomer();
                    }
                    case 0 -> {
                    }
                }
            } while (choice != 0);
    }
}
