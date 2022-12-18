package com.GarbageCollection;

public class Main {
    public void finalize(){
        System.out.println("GC");
    }
    public static void main(String[] args) {
	Main m = new Main();
     Main m1 = new Main();
	m = null;
	m1 = null;
	System.gc();
    }
}
