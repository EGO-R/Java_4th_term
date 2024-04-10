package org.java4term.pr_6.abstractFabric;

import org.java4term.pr_6.abstractFabric.factories.MacFactory;
import org.java4term.pr_6.abstractFabric.factories.WinFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        var winFactory = new WinFactory();
        var winForm = new Form(winFactory);

        var macFactory = new MacFactory();
        var macForm = new Form(macFactory);
    }
}
