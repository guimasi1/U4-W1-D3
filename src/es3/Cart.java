package es3;

import java.util.Arrays;

public class Cart {
    private int id;
    private Article[] articles;
    private double totalCost;

    private Customers customer;

    // COSTRUTTORI

    public Cart(Customers customer) {
        this.id = customer.getId();
    }
    public void printCart() {
        System.out.println("cart id: " + this.id);
    }

}
