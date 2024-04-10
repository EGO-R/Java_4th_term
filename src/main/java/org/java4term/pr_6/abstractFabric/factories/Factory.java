package org.java4term.pr_6.abstractFabric.factories;

import org.java4term.pr_6.abstractFabric.products.Button;
import org.java4term.pr_6.abstractFabric.products.Select;
import org.java4term.pr_6.abstractFabric.products.TextField;

public interface Factory {
    Button createButton();
    Select createSelect();
    TextField createTextField();
}
