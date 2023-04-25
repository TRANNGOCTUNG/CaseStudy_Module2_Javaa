package modal.person;

import java.io.Serializable;

public class Customer extends Person implements Serializable {
    private String phone;

    public Customer() {
    }

    public Customer(String name, int age, String address,String phone) {
        super(name, age, address);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  super.toString()+ "PersonManager{" + "position='" + phone + '\'' + '}';
    }
}