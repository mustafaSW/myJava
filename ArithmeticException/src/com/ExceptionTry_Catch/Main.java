package com.ExceptionTry_Catch;

public class Main {

    public static void main(String[] args) {

        try {
            int i = 100/0;
            System.out.println(i);
        } catch (ArithmeticException e) {
           System.out.println("you can not divide by zero");
        }
        System.out.println("mustafa");
    }
}
