package creational.methods.factory.examples.notification.factory;

import creational.methods.factory.examples.notification.notification.Notification;

public abstract class NotificationFactory {
    
    public void notifyUser() {
        Notification notification = createNotification();
        notification.notifyUser();
    }

    protected abstract Notification createNotification();
}
