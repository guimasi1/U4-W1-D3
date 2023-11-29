package es3;

import java.util.Date;

public class Customers {
    private final int id;
    private String name;
    private String surname;
    private String email;
    private final Date registrationDate;

    public Customers(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.registrationDate = new Date();
    }

    public void printCustomer() {
        System.out.println("id: " + this.id + ", name: " + this.name + ", surname: " + this.surname + ", email: " + this.email);
        System.out.println("registration date: " + this.registrationDate);
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getEmail() {
        return this.email;
    }
    public Date getRegistrationDate() {
        return this.registrationDate;
    }

}
