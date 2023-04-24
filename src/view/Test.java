package view;

import controller.ManagerPerson;
import modal.person.Person;
import modal.person.PersonManager;

import java.util.List;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ManagerPerson userBook = new ManagerPerson();
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
        PersonManager personManager = new PersonManager(name, age, address, position);
        list.add(personManager);
        return list;
    }
}
