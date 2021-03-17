package com.easv;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	PingPong pp1 = new PingPong("Ping");
	PingPong pp2 = new PingPong("Pong");
	pp1.start();
	Thread.sleep(500);
	pp2.start();
    }
}
