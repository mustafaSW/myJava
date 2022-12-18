package com.Network;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String ip4pattern = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
        Pattern p = Pattern.compile(ip4pattern);
	String []ipNo = {"192.168.0.1","192.168.0.2","192.168.0.3","192.168.0.4","google.com"};
        for (String s:ipNo) {
            Matcher m = p.matcher(s);
            System.out.println(s+" is: "+(m.matches() ? "valid":"invaild"));
        }
    }
}
