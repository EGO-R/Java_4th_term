package org.java4term.pr_6.abstractFabric;

import org.java4term.pr_6.abstractFabric.factories.Factory;
import org.java4term.pr_6.abstractFabric.products.Button;
import org.java4term.pr_6.abstractFabric.products.Select;
import org.java4term.pr_6.abstractFabric.products.TextField;

public class Form {
    private Button button;
    private Select select;
    private TextField textField;
    public Form(Factory factory) {
        button = factory.createButton();
        select = factory.createSelect();
        textField = factory.createTextField();
    }

}
