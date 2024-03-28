public class Account {
    int AccountNumber=123;
    double balance=3000.00;
    /*returnType methodName(parameters)
    {
        //method body
    }*/
    void deposit(double amount)
    {
        System.out.println("Total amount= "+(balance+amount));
    }
    boolean withdraw(double amount)
    {
        if (amount<balance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
