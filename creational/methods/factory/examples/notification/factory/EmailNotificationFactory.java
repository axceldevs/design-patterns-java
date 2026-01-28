package creational.methods.factory.examples.notification.factory;

import creational.methods.factory.examples.notification.notification.EmailNotification;
import creational.methods.factory.examples.notification.notification.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
    
}
