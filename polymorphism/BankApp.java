package polymorphism;

public class BankApp {
    public static void main(String[] args) {
        Bank icici = new ICICI();
        Bank boi = new BOI();
        icici.setInterestRate();
        boi.setInterestRate();
        icici.getInterestRate();
        boi.getInterestRate();
    }
}
