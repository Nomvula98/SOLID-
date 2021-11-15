package singleResponsibilityExample;

public class PrinterService {
    //This class satisfies the Single responsibility principle because it focuses on only Printer services
    public void printPassbook() {
        //update transaction info in passbook
        System.out.println("Updated info in passbook");
    }

}
