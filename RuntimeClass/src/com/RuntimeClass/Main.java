package com.RuntimeClass;



public class Main {

    public static void main(String[] args) throws Exception {
	//Runtime.getRuntime().exec("tap  ");
        Runtime m = Runtime.getRuntime();
        System.out.println("memory = "+m.totalMemory());
        System.out.println("free memory = "+m.freeMemory());
        System.out.println("Max memory = "+m.maxMemory());

        for (int i = 0; i < 20000; i++) {
            new Main();
        }
        System.out.println("free memory after run  =   "+m.freeMemory());
        System.gc();
        System.out.println("free memory after run gc = "+m.freeMemory());
    }
}
