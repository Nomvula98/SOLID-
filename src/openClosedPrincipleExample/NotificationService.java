package openClosedPrincipleExample;

public class NotificationService {
    //Problem: If someone wants to change the medium to SMS or Whatsapp..
    //You will be violating the open-closed principle if you modify the method in this class or if you add a method in this class,
    //instead you can create an interface with the declaration of the methods, then you can implement the method for different mediums in different classes
    // or you can apply inheritance by extending this class
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI

            System.out.println("Send Notification using "+medium);
        }
    }

}
