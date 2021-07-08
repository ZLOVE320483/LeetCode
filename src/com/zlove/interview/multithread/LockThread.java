package com.zlove.interview.multithread;

public class LockThread extends Thread {

    private Object mLock;

    public LockThread(Object lock) {
        this.mLock = lock;
    }

    @Override
    public void run() {
        super.run();

        synchronized (mLock) {
            try {
                mLock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("--- LockThread ---");
        }
    }
}
