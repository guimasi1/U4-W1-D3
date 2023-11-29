package es2;

import java.util.Arrays;

public class Sim {
    private final String telephoneNumber;
    private int credit = 0;
    private String[] lastFiveCalls;

    // COSTRUTTORI
    public Sim(String telephoneNumber) {
         this.telephoneNumber = telephoneNumber;
    }
    public Sim(String telephoneNumber, int credit) {
        this.telephoneNumber = telephoneNumber;
        this.credit = credit;
    }

    public void printSimData() {
        System.out.println("telephone number: " + this.telephoneNumber + ", credit: " + this.credit + ", last calls: " + Arrays.toString(this.lastFiveCalls));
    }

}
