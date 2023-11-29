package es2;

import java.util.Arrays;

public class Sim {
    private final String telephoneNumber;
    private int credit = 0;
    private Call[] lastFiveCalls;

    // COSTRUTTORI

    public Sim(String telephoneNumber, int credit) {
        this.telephoneNumber = telephoneNumber;
        this.credit = credit;
        this.lastFiveCalls = new Call[5];
    }

    public void makeACall(String calledNumber, int duration) {
        Call newCall = new Call(calledNumber, duration);
        for (int i = 0; i < lastFiveCalls.length; i++) {
            if (lastFiveCalls[i] == null) {
                lastFiveCalls[i] = newCall;
                break;
            }
        }
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void printSimData() {
        System.out.println("telephone number: " + this.telephoneNumber + ", credit: " + this.credit);
        System.out.println("last calls: ");
        for (Call lastFiveCall : lastFiveCalls) {
            if (lastFiveCall != null) {
                System.out.println("Called Number: " + lastFiveCall.getCalledNumber() + ", Duration: " + lastFiveCall.getDuration());
            }

        }
    }
}