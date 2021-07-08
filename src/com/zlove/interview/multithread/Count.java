package com.zlove.interview.multithread;

public class Count implements Runnable {

    private static Integer sCount = 0;

    public static int getCount() {
        return sCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (sCount) {
                sCount++;
            }
        }
    }

}
