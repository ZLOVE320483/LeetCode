package com.zlove.interview.multithread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockThread extends Thread {

    private ReentrantLock mLock = new ReentrantLock();

    @Override
    public void run() {
        super.run();
        mLock.lock();
        System.out.println("--- outside ---");
        mLock.lock();
        System.out.println("--- inside ----");
        mLock.unlock();
        mLock.unlock();
    }
}
