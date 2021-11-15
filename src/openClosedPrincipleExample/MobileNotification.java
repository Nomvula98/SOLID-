package openClosedPrincipleExample;

public class MobileNotification implements  INotificationService{
    //This class fulfils the Open-closed Principle because it extends the project without modifying the existing code

    @Override
    public void sendOTP(String medium) {
        System.out.println("\nSend OTP Using "+ medium);
    }

    @Override
    public void sendTransactionNotification(String medium) {
        System.out.println("\nSend transaction Notification Using "+ medium);
    }
}
