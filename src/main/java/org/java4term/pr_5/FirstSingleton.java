package org.java4term.pr_5;

public class FirstSingleton {
    private FirstSingleton instance;
    public synchronized FirstSingleton getInstance() {
        if(instance == null) {
            instance = new FirstSingleton();
            return instance;
        }
        return instance;
    }
}
