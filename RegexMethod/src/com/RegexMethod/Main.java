package com.RegexMethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String s = "my name is mustafa ahmed ibraheem";
        String m = "ahmed";
        Pattern p = Pattern.compile(m);
        Matcher n = p.matcher(s);
        System.out.println(s);
        while (n.find()){
            System.out.println("yes founded : "+ m+" at "+n.start());
            System.out.println("the match : "+ n+" at "+n.group());

            int i = 0;
            while (n.find()){
                ++i;
            }
            System.out.println("Total : "+i);
        }
    }
}
