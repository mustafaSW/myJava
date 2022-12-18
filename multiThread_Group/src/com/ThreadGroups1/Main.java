package com.ThreadGroups1;
public class Main implements Runnable{

    public static void main(String []args){

        Main tg = new Main();
        tg.func();
    }

    public void func() {
        try {
            ThreadGroup threadGroup1 = new ThreadGroup("parent ThreadGroup");
            ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1,"child ThreadGroup");

            Thread t1 = new Thread(threadGroup1,this);
            System.out.println("starting :"+t1.getName()+"...");
            t1.start();

            Thread t2 = new Thread(threadGroup2,this);
            System.out.println("starting :"+t2.getName()+"...");
            t2.start();

            System.out.println("it's works :\\"+threadGroup1.getName()+"\\"+"="+threadGroup1.activeCount());

            t1.join();
            t2.join();

            threadGroup2.destroy();
            System.out.println(threadGroup2.getName()+" destroy");

            threadGroup1.destroy();
            System.out.println(threadGroup1.getName()+"destroy");

        }catch (InterruptedException e){
            System.out.println(e.toString());
        }
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            i++;
        }
        System.out.println(Thread.currentThread().getName()+"priority = "+Thread.currentThread().getPriority()+"finish executingr");
    }
}
