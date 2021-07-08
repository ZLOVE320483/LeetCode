package com.zlove.interview.multithread;

public class SynchronizedThread extends Thread {

    @Override
    public void run() {
        super.run();
        synchronized (this) {
            System.out.println("--- outside ---");
            synchronized (this) {
                System.out.println("--- inside ----");
            }
        }
    }
}
