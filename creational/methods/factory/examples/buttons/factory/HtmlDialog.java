package creational.methods.factory.examples.buttons.factory;

import creational.methods.factory.examples.buttons.buttons.Button;
import creational.methods.factory.examples.buttons.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
