import openClosedPrincipleExample.EmailNotification;
import openClosedPrincipleExample.INotificationService;
import openClosedPrincipleExample.MobileNotification;
import openClosedPrincipleExample.WhatsAppNotification;
import singleResponsibilityExample.*;

public class Main {
    public static void main(String[] args) {
        //Too many responsibilities
        BankServices bankServices = new BankServices();
        bankServices.deposit(200, "987653");
        bankServices.withdraw(100, "1234567");
        bankServices.printPassbook();
        bankServices.sendOTP("email");
        bankServices.getLoanInterestInfo("car");

        //Proper way
        MoneyTransactions transactions = new MoneyTransactions();
        PrinterService printerService = new PrinterService();
        LoanService loanService = new LoanService();
        NotificationService notificationService = new NotificationService();
        System.out.println("\n-----------------------------");

        transactions.deposit(300, "456723456");
        transactions.withdraw(1000, "9876543");
        printerService.printPassbook();
        notificationService.sendOTP("email");
        loanService.getLoanInterestInfo("car");
        System.out.println("\n-----------------------------");

        INotificationService emailNotification = new EmailNotification();
        emailNotification.sendTransactionNotification("Email");

        INotificationService whatsapp = new WhatsAppNotification();
        whatsapp.sendTransactionNotification("Whatsapp");

        INotificationService mobile = new MobileNotification();
        emailNotification.sendTransactionNotification("mobile");

    }

}
