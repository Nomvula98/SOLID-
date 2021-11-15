package openClosedPrincipleExample;

public interface INotificationService {
    //This satisfies the Open-closed Principle because this class will not be modified by anyone,
    // instead it will be implemented by different classes
    public void sendOTP(String medium);
    public void sendTransactionNotification(String medium);
}
