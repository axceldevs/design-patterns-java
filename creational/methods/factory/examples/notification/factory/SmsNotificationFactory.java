package creational.methods.factory.examples.notification.factory;

import creational.methods.factory.examples.notification.notification.Notification;
import creational.methods.factory.examples.notification.notification.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
    
}
