package view;

import controller.CustomerManager;
import modal.person.Person;
import modal.person.Customer;

import java.util.List;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CustomerManager userBook = new CustomerManager();
        List<Person> people =userBook.getListPerson();
        add(people);
        userBook.display();
    }
    public static List<Person> add(List<Person> list) {
        System.out.println("Add name personManager: ");
        String name = scanner.next();
        System.out.println("Add age personManager: ");
        int age = scanner.nextInt();
        System.out.println("Add address personManager: ");
        String address = scanner.next();
        System.out.println("Add position personManager: ");
        String position = scanner.next();
        Customer personManager = new Customer(name, age, address, position);
        list.add(personManager);
        return list;
    }
}
