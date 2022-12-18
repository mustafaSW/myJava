package com.Thread_1;

public class Main extends Thread{
public void run(){
    for (int i = 0; i < 15; i++) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(i+" of 14");
    }
}
    public static void main(String[] args) {
	Main m = new Main();
	m.run();
    }
}
