package com.xh.d7_thread_comunication;

public class ProductorThread extends Thread {
    private Desk desk;
    public ProductorThread(Desk desk,String name) {
        super(name);
        this.desk = desk;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                desk.put();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
