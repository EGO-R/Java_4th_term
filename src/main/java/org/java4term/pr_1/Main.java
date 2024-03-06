package org.java4term.pr_1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Object[]> comparator = Comparator.comparingInt(o -> o.length);

        Integer[] arr1 = {12, 3};
        Integer[] arr2 = {1};
        Integer[] arr3 = {1};

        System.out.println(comparator.compare(arr1, arr2));
        System.out.println(comparator.compare(arr2, arr1));
        System.out.println(comparator.compare(arr2, arr3));
    }
}
