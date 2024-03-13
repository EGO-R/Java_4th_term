package org.java4term.pr_3;

public class Main {

    public static void main(String[] args) {
        SafeList<Integer> integerSafeList = new SafeList<>();

        Thread thread1 = new Thread(() -> {
            integerSafeList.add(1);
            integerSafeList.get(0);
            integerSafeList.remove(3);
        });

        Thread thread2 = new Thread(() -> {
            integerSafeList.add(3);
            integerSafeList.get(0);
            integerSafeList.remove(1);
        });

        Thread thread3 = new Thread(() -> {
            integerSafeList.add(5);
            integerSafeList.get(0);
            integerSafeList.remove(3);
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
