package com.zlove.interview.threadlocal;

public class ThreadLocalTest {

    private static String strLabel;
    private static ThreadLocal<String> threadLocalLabel = new ThreadLocal<>();

    public static void main(String[] args) {

        strLabel = "main";
        threadLocalLabel.set("main");

        Thread thread = new Thread(() -> {
            strLabel = "child";
            threadLocalLabel.set("child");

            System.out.println("threadLabel111 = " + threadLocalLabel.get());
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("strLabel = " + strLabel);
        System.out.println("threadLabel222 = " + threadLocalLabel.get());
    }
}
