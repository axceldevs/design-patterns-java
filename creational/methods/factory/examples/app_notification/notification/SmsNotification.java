package creational.methods.factory.examples.app_notification.notification;

public class SmsNotification implements Notification{

    private static final String MESSAGE = "Sending SMS notification: Your code is 1234";

    @Override
    public void notifyUser() {
        System.out.println(MESSAGE);
    }
}
