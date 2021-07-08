package com.zlove.interview.turn.thread;

public class Main {

    public static void main(String[] args) {
        WaitNotifyPrint waitNotifyPrint = new WaitNotifyPrint();
        Thread threadA = new Thread(() -> {
            waitNotifyPrint.print(0);
        }, "A");

        Thread threadB = new Thread(() -> {
            waitNotifyPrint.print(1);
        }, "B");

        Thread threadC = new Thread(() -> {
            waitNotifyPrint.print(2);
        }, "C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
