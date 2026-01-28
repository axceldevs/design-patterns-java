package creational.methods.factory.examples.notification.notification;

public class EmailNotification implements Notification {

    private static final String SUBJECT = "Sending EMAIL notification: Welcome to our service!";

    @Override
    public void notifyUser() {
        System.out.println(SUBJECT);
    }

}
