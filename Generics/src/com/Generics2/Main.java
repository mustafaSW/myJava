package com.Generics2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<String>();
        list.add("mustafa");
        list.add("ahmed");
        list.add("ibraheem");
        list.add("jawad");
        String str = list.get(1);
        System.out.println(str);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
