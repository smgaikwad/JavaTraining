package abstractkeyword;
public class AbstractClassDemo {
    public static void main(String[] args) {
        Bank icici = new ICICI();
        Bank sbi = new SBI();
        System.out.println("ICICI interest rate: "+icici.getInterest());
        System.out.println("SBI interest rate: "+sbi.getInterest());
        System.out.println("Branches: "+Bank.noOfBranches);
    }
}
