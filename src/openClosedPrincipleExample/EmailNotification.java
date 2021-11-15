package openClosedPrincipleExample;

public class EmailNotification implements INotificationService{
    //This class fulfils the Open-closed Principle because it extends the project without modifying the existing code
    @Override
    public void sendOTP(String medium) {
        System.out.println("\n Send OTP Using "+ medium);
    }

    @Override
    public void sendTransactionNotification(String medium) {
        System.out.println("\n Send transaction Notification Using "+ medium);
    }
}
