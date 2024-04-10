package org.java4term.pr_6.abstractFabric.factories;

import org.java4term.pr_6.abstractFabric.products.Button;
import org.java4term.pr_6.abstractFabric.products.Select;
import org.java4term.pr_6.abstractFabric.products.TextField;
import org.java4term.pr_6.abstractFabric.products.windows.WinButton;
import org.java4term.pr_6.abstractFabric.products.windows.WinSelect;
import org.java4term.pr_6.abstractFabric.products.windows.WinTextField;

public class WinFactory implements Factory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Select createSelect() {
        return new WinSelect();
    }

    @Override
    public TextField createTextField() {
        return new WinTextField();
    }
}
