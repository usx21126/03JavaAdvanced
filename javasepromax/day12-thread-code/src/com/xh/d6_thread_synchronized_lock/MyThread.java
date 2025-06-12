package com.xh.d6_thread_synchronized_lock;

class MyThread extends Thread {
    private static Account acc;
    public MyThread() {
        super();
    }
    public MyThread(String name, Account acc) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.drawMony(100000);
    }
}
