package factory_method.factory;

import factory_method.buttons.Button;
import factory_method.buttons.HTMLButton;

public class HTMLDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
