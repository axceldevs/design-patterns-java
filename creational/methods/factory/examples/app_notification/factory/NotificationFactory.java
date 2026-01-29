package creational.methods.factory.examples.app_notification.factory;

import creational.methods.factory.examples.app_notification.notification.Notification;

public abstract class NotificationFactory {
    
    public void notifyUser() {
        Notification notification = createNotification();
        notification.notifyUser();
    }

    protected abstract Notification createNotification();
}
