package singleResponsibilityExample;

public class LoanService {
    //This class satisfies the Single responsibility principle because it focuses on one responsibility which is Loan services
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            //do some job
            System.out.println("Do home Loan");
        }
        if (loanType.equals("personalLoan")) {
            //do some job
            System.out.println("Do personal Loan");
        }
        if (loanType.equals("car")) {
            //do some job
            System.out.println("Do car Loan");
        }
    }
}
