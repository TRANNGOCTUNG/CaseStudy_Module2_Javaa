package controller;

import modal.interfaces.CRUD;
import modal.interfaces.InSearchSort;
import modal.person.Person;
import modal.person.PersonManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPerson implements CRUD<Person>, InSearchSort {

    private List<Person> persons;
    private Scanner scanner = new Scanner(System.in);

    public ManagerPerson() {
        persons = new ArrayList<Person>();
        persons.add(new PersonManager("Trần Hồng Quân",24,"Hà Nội","Quản Lý"));
//        persons.add(new Customer("Trần Xuân Mạnh",23,"Nam Định","083476698"));
    }

    @Override
    public void add(Person value) {
        persons.add(value);
    }

    @Override
    public void display() {
        for (Person p:persons
             ) {
            System.out.println(p);
        }
    }

    @Override
    public void edit(Person value) {
        System.out.println("Enter index edit: ");
        int index = scanner.nextInt();
        for (int i = 0; i < persons.size() ; i++) {
            if(i == index) {
                persons.set(i, value);
            }
        }
    }
    @Override
    public void delete() {
        System.out.println("Enter index delete: ");
        int index = scanner.nextInt();
        for (int i = 0; i < persons.size(); i++) {
            if(i == index) {
                persons.remove(i);
            }
        }
    }

    @Override
    public void insert(Object list, int index) {


    }

    @Override
    public void search(Object list, String name) {

    }

    @Override
    public void sort() {

    }
    public List<Person> getListPerson(){
        return persons;
    }
}
