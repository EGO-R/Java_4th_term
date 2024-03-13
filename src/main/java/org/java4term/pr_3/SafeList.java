package org.java4term.pr_3;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SafeList<T> {
    private List<T> list;
    private final Semaphore semaphore;
    private int size;

    public SafeList() {
        this.list = new ArrayList<>();
        this.semaphore = new Semaphore(1);
        size = 0;
    }

    @SneakyThrows
    public boolean add(T o) {
        semaphore.acquire();

        boolean isAdded = list.add(o);
        size++;

        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " added " + o);
        return isAdded;
    }

    @SneakyThrows
    public T get(int index) {
        semaphore.acquire();

        T o = list.get(index);

        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " got " + o);
        return o;
    }

    @SneakyThrows
    public boolean remove(T o) {
        semaphore.acquire();

        boolean isRemoved = list.remove(o);
        size--;

        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " removed " + o);
        return isRemoved;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
