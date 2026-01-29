package creational.methods.factory.examples.app_notification.factory;

import creational.methods.factory.examples.app_notification.notification.Notification;
import creational.methods.factory.examples.app_notification.notification.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
    
}
