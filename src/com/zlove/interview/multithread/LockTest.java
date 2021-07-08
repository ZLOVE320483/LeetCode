package com.zlove.interview.multithread;

public class LockTest {

    public void runTest() {
        Count count = new Count();
        Thread t1 = new Thread(count);
        t1.setName("--- t1 ---");
        Thread t2 = new Thread(count);
        t2.setName("--- t2 ---");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Count.getCount());
    }

    public void increase(Integer integer) {
        integer++;
    }
}
