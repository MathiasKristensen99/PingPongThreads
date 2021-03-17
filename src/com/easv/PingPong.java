package com.easv;

public class PingPong extends Thread{
    private String name;

    public PingPong(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
