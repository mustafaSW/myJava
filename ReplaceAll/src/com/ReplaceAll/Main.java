package com.ReplaceAll;

public class Main {

    public static void main(String[] args) {
    String s1 = "mustafa ahmed";

    String s2 = s1.replace ("m","M");
    System.out.println(s2);

    String ss = "mustafa ahmed ibraheem";
    String ss1 = ss.replaceAll(ss,"hallo");
    System.out.println(ss1);

        String sss = "mustafa ahmed ibraheem";
        String sss1 = ss.replaceAll("mustafa","hallo");
        System.out.println(sss1);
    }
}
