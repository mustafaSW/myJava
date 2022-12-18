package com.Quantifife;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	boolean b1 = Pattern.matches("[muh]?","m");
	boolean b3 = Pattern.matches("[muh]?","u");
    boolean b2 = Pattern.matches("[muh]?","mm");
        boolean b4 = Pattern.matches("[muh]+","m");
        boolean b5 = Pattern.matches("[muh]+","mmm");
        boolean b6 = Pattern.matches("[muh]+","muhm");
        boolean b7 = Pattern.matches("[muh]+","mxxm");

    System.out.println("1 :"+b1);
    System.out.println("2 :"+b2);
    System.out.println("3 :"+b3);
        System.out.println("____________________");
        System.out.println("4 :"+b4);
        System.out.println("5 :"+b5);
        System.out.println("6 :"+b6);
        System.out.println("7 :"+b7);
        System.out.println("____________________");
        boolean bb = Pattern.matches("[muh]*","mm");
        boolean bb1 = Pattern.matches("m{1}","mm");
        boolean bb2 = Pattern.matches("m{3}","mmmm");
        boolean bb3 = Pattern.matches("m{3,5}","mmm");
        System.out.println(bb);
        System.out.println(bb1);
        System.out.println(bb2);
        System.out.println(bb3);

    }
}
