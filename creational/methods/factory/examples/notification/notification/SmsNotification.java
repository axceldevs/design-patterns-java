package creational.methods.factory.examples.notification.notification;

public class SmsNotification implements Notification{

    private static final String MESSAGE = "Sending SMS notification: Your code is 1234";

    @Override
    public void notifyUser() {
        System.out.println(MESSAGE);
    }
}
