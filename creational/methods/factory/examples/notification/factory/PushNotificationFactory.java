package creational.methods.factory.examples.notification.factory;

import creational.methods.factory.examples.notification.notification.Notification;
import creational.methods.factory.examples.notification.notification.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

