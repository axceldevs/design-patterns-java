package creational.methods.factory.examples.buttons.factory;

import creational.methods.factory.examples.buttons.buttons.Button;
import creational.methods.factory.examples.buttons.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
