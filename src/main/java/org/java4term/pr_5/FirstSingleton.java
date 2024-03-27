package org.java4term.pr_5;

public class FirstSingleton {
    private static FirstSingleton INSTANCE = null;
    public static synchronized FirstSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new FirstSingleton();
            return INSTANCE;
        }
        return INSTANCE;
    }

    private FirstSingleton() {}
}
