package com.xh.d4_thread_synchronized_code;

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
