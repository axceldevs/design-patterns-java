package creational.methods.factory.examples.buttons;

import creational.methods.factory.examples.buttons.factory.Dialog;
import creational.methods.factory.examples.buttons.factory.HtmlDialog;
import creational.methods.factory.examples.buttons.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    private static final String OPERATING_SYSTEM_WINDOWS = "Windows";
    private static final String OPERATING_SYSTEM_MAC = "Mac OS X";

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    
    private static void configure() {
        String osName = System.getProperty("os.name");
        if (osName.equals(OPERATING_SYSTEM_WINDOWS)) {
            dialog = new WindowsDialog();
        } else if (osName.equals(OPERATING_SYSTEM_MAC)) {
            dialog = new HtmlDialog();
        } else {
            throw new RuntimeException("Error! Unknown operating system: " + osName);
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
