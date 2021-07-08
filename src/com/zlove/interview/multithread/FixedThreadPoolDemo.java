package com.zlove.interview.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " -> Running...");
            });
        }
    }

}
