public class SavingsAccount extends Account{
    double interestRate=0.03;
    double calculateInterest(int amount)
    {
        double result= amount*interestRate;
        return result;
    }
    public static void main (String args[])
    {
        SavingsAccount ameer= new SavingsAccount();
        ameer.deposit(45000);
        ameer.withdraw(300.00);
        System.out.println(ameer.calculateInterest(30000));
    }
}
