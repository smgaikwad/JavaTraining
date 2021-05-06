package abstractkeyword;
public abstract class Bank {
    public static int noOfBranches = 0;
    public abstract int getInterest();
    Bank()
    {
        noOfBranches++;
    }
}
