package controller;

import Storage.ReadWriteFile;
import modal.interfaces.CRUD;
import modal.interfaces.SearchSort;
import modal.person.Person;
import modal.person.Customer;

import java.util.*;

public class CustomerManager implements CRUD<Person> {
    private ReadWriteFile<Person> readWriteFile = ReadWriteFile.getINSTANCE();
    private List<Person> persons;
    private Scanner scanner = new Scanner(System.in);

    public CustomerManager() {
        persons = new ArrayList<Person>();
        persons.add(new Customer("Trần Hồng Quân",24,"Hà Nội","0123456789"));
        persons.add(new Customer("Trần Xuân Mạnh",23,"Nam Định","0823456987"));
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

    public void search(List<Person> list,String name) {
        for (int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getName().equals(name)){
                System.out.println(name + " getName " +  " index : " + i );
            } else {
                System.out.println("Can not found: ");
            }
        }
    }
    public void sortAge() {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
    }
    public List<Person> getListPerson(){
        return persons;
    }
    public void readData(String path){
        readWriteFile.readFile(path);
    }
    public void writeData(List<Person> value,String path) {
        readWriteFile.writeFile(persons,path);
    }
}
