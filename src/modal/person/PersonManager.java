package modal.person;

import java.io.Serializable;

public class PersonManager extends Person implements Serializable {
    private String position;

    public PersonManager() {
    }

    public PersonManager(String name, int age, String address, String position) {
        super(name, age, address);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "PersonManager{" +
                "position='" + position + '\'' +
                '}';
    }
}