package es2;

public class MainSim {
    public static void main(String[] args) {
        Sim sim2WithCredit = new Sim("3283040567", 100);
        sim2WithCredit.printSimData();
        sim2WithCredit.makeACall("222333444555", 2);
        sim2WithCredit.makeACall("3424242", 25);
        sim2WithCredit.makeACall("222333443454555", 22);
        sim2WithCredit.makeACall("222333444353454354555", 23);
        sim2WithCredit.printSimData();

    }
}
