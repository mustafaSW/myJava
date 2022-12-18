package com.Annanymuos_static_Synchronized;

class Table{
    synchronized static void printing(int n){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i*n);
            try {
                Thread.sleep(400);

            } catch (InterruptedException e) {

            }
        }
    }
}

public class Main {

    public static void main(String[] args) {


       Thread t1 = new Thread(){
           public void run() {
               Table.printing(1);
           }
       };


        Thread t2 = new Thread(){
            public void run() {
                Table.printing(10);
            }
        };

        Thread t3 = new Thread(){
            public void run() {
                Table.printing(100);
            }
        };
        Thread t4 = new Thread(){
            public void run(){
          Table.printing(1000);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

