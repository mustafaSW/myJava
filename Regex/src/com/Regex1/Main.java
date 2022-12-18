package com.Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern p = Pattern.compile(".m.");
        Matcher m = p.matcher("bmw");
        boolean b = m.matches();
        System.out.println(b);

        boolean b1 = Pattern.compile(".s.").matcher("asa").matches();
        System.out.println(b1);

        boolean b2 = Pattern.matches("mam","sas");
        System.out.println(b2);

    }
}
