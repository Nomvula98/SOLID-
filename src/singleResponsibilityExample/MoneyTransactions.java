package singleResponsibilityExample;

public class MoneyTransactions {
    //This class satisfies the Single responsibility principle because it focuses on only Money Transaction services
    public long deposit(long amount, String accountNo) {
        //deposit amount
        System.out.println("Deposited Money");
        return 0;
    }

    public long withdraw(long amount, String accountNo) {
        //withdraw amount
        System.out.println("Withdrew Money");
        return 0;
    }
}
