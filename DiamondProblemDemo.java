package JavaByCoderArmy;

public class DiamondProblemDemo {

    // Base Interface
    interface Notification {

        default void send(String msg) {
            System.out.println("Sending generic notification: " + msg);
        }

        default void log(String msg) {
            System.out.println("Logging notification: " + msg);
        }

        default boolean validate(String msg) {
            return msg != null && !msg.isEmpty();
        }
    }

    // Email Channel
    interface EmailNotification extends Notification {

        @Override
        default void send(String msg) {
            System.out.println("Sending EMAIL: " + msg);
        }

        @Override
        default void log(String msg) {
            System.out.println("Email log stored in Email Server");
        }

        default void connectSMTP() {
            System.out.println("Connecting to SMTP server...");
        }
    }

    // SMS Channel
    interface SMSNotification extends Notification {

        @Override
        default void send(String msg) {
            System.out.println("Sending SMS: " + msg);
        }

        @Override
        default void log(String msg) {
            System.out.println("SMS log stored in Telecom DB");
        }

        default void connectGateway() {
            System.out.println("Connecting to SMS Gateway...");
        }
    }

    // Push Notification Channel
    interface PushNotification extends Notification {

        @Override
        default void send(String msg) {
            System.out.println("Sending PUSH notification: " + msg);
        }

        default void connectFirebase() {
            System.out.println("Connecting to Firebase...");
        }
    }

    // Class facing DIAMOND PROBLEM
    static class MultiChannelNotifier implements EmailNotification, SMSNotification, PushNotification {

        // Resolving conflict of send()
        @Override
        public void send(String msg) {

            // Strategy 1: Combine all implementations
            EmailNotification.super.send(msg);
            SMSNotification.super.send(msg);
            PushNotification.super.send(msg);

            System.out.println("All channels notified.");
        }

        // Resolving conflict of log()
        @Override
        public void log(String msg) {

            // Strategy 2: Choose one implementation
            EmailNotification.super.log(msg);

            System.out.println("Central log complete.");
        }

        // Resolving conflict of validate()
        @Override
        public boolean validate(String msg) {

            // Strategy 3: Custom implementation
            System.out.println("Running custom validation...");
            return msg.length() > 5;
        }

        // Extra method using all interfaces
        public void connectAllServices() {
            connectSMTP();
            connectGateway();
            connectFirebase();
        }
    }

    // Main Method
    public static void main(String[] args) {

        MultiChannelNotifier notifier = new MultiChannelNotifier();

        String msg = "Hello User";

        if (notifier.validate(msg)) {
            notifier.connectAllServices();
            notifier.send(msg);
            notifier.log(msg);
        } else {
            System.out.println("Invalid message!");
        }
    }
}

