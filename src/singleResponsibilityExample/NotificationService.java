package singleResponsibilityExample;

public class NotificationService {
    //This class satisfies the Single responsibility principle because it focuses on only Notification services

    public void sendOTP(String medium) {
        if (medium.equals("email")) {

            System.out.println("Send OTP to email");
        }
    }

}
