package creational.methods.factory.examples.app_notification;

import creational.methods.factory.examples.app_notification.factory.EmailNotificationFactory;
import creational.methods.factory.examples.app_notification.factory.NotificationFactory;
import creational.methods.factory.examples.app_notification.factory.PushNotificationFactory;
import creational.methods.factory.examples.app_notification.factory.SmsNotificationFactory;
import creational.methods.factory.examples.app_notification.util.NotificationType;

public class Demo {
    public static void main(String[] args) {
        NotificationFactory factory = configure(NotificationType.PUSH);
        runBusinessLogic(factory);
    }

    public static NotificationFactory configure(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotificationFactory();
            case SMS:
                return new SmsNotificationFactory();
            case PUSH:
                return new PushNotificationFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void runBusinessLogic(NotificationFactory notifyUser) {
        notifyUser.notifyUser();
    }
}
