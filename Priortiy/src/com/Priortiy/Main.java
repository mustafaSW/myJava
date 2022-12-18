package com.Priortiy;
//public static int MIN_PRIORITY
//public static int NORMAL_PRIORITY
//public static int MAX_PRIORITY
public class Main extends Thread{
    public void run() {
        System.out.println("Thread = "+Thread.currentThread().getName());
        System.out.println("Thread_priority= "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.setPriority(1);
        m.start();
    }
}
