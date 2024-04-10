package org.java4term.pr_6.abstractFabric.factories;

import org.java4term.pr_6.abstractFabric.products.Button;
import org.java4term.pr_6.abstractFabric.products.Select;
import org.java4term.pr_6.abstractFabric.products.TextField;
import org.java4term.pr_6.abstractFabric.products.mac.MacButton;
import org.java4term.pr_6.abstractFabric.products.mac.MacSelect;
import org.java4term.pr_6.abstractFabric.products.mac.MacTextField;

public class MacFactory implements Factory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}
