package creational.methods.factory.examples.notification.notification;

public class PushNotification implements Notification {

    private static final String MESSAGE = "Sending PUSH notification: New message received";

    @Override
    public void notifyUser() {
        System.out.println(MESSAGE);
    }    
}
