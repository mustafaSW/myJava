package com.RegexRepalce;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //                          (o)    bis (u)
        //die berichtigung ist von mostafa bis mustafa
        String s = "manche leute schreiben mein name so (mustafa) und manche so (mostafa) aber mein name ist so geschrieben (mustafa)" +
                " des wegen den programm berichtigt die rechtscheibfehler von mostafa bis mustafa ";

        String check = "mostafa.*?";
        Pattern patt = Pattern.compile(check);
        Matcher mat = patt.matcher(s);
        System.out.println(s);
        s = mat.replaceAll("mustafa");
        System.out.println(s);

    }
}
