package creational.methods.factory.examples.app_notification.factory;

import creational.methods.factory.examples.app_notification.notification.EmailNotification;
import creational.methods.factory.examples.app_notification.notification.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
    
}
