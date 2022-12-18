package com.Generics5;

public class Main{
    public static <E>void printAll(E[] element){
        for (E e:element) {
            System.out.println(e);
        }
    }
    public static void main(String []args){

        String []names = {"mustafa","ahmed","ibraheem"};
        Character []ch = {'m','u','s','t'};
        Integer []in = {1,2,3,4,5,6};

        System.out.println("names");
        printAll(names);

        System.out.println("ch");
        printAll(ch);

        System.out.println("in");
        printAll(in);

    }
}






