package com.zlove.interview.turn.thread;

public class WaitNotifyPrint {

    private int num = 0;
    private static final Object LOCK = new Object();

    public void print(int targetNum) {
        for (int i = 0; i < 10; i++) {
            synchronized (LOCK) {
                while (num % 3 != targetNum) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num++;
                System.out.print(Thread.currentThread().getName());
                LOCK.notifyAll();
            }
        }

    }

}
