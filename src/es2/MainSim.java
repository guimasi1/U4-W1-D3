package es2;

public class MainSim {
    public static void main(String[] args) {
        Sim sim1 = new Sim("3313334557");
        sim1.printSimData();
        Sim sim2WithCredit = new Sim("3283040567", 100);
        sim2WithCredit.printSimData();
    }
}
