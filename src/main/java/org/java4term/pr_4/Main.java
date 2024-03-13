package org.java4term.pr_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = new MyExecutorService(2);

        Future<Integer> submit1 = executorService.submit(() -> 2 + 1);
        Future<Integer> submit2 = executorService.submit(() -> 2 + 2);
        Future<Integer> submit3 = executorService.submit(() -> 2 + 3);

        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());

        executorService.shutdownNow();
    }
}
