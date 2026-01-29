package creational.methods.factory.examples.app_notification.factory;

import creational.methods.factory.examples.app_notification.notification.Notification;
import creational.methods.factory.examples.app_notification.notification.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

