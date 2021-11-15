package singleResponsibilityExample;

public class BankServices {
    // This class violates the Single responsibility principle because it has many responsibilities such as
    //money transactions and printing and getting loan and notification, we have to separate the responsibilities to different classes
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

    public void printPassbook() {
        //update transaction info in passbook
        System.out.println("Updated info in passbook");
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {

            System.out.println("Do home Loan");
        }
        if (loanType.equals("personalLoan")) {

            System.out.println("Do personal Loan");
        }
        if (loanType.equals("car")) {

            System.out.println("Do car Loan");
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {

            System.out.println("Send OTP to email");
        }
    }
}
