package com.InetAddresses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args)throws IOException {

        InetAddress ia = InetAddress.getByName("69.171.250.35");
        System.out.println(ia.getHostName());

        try {


            InetAddress is = InetAddress.getLocalHost();
            String s = is.getHostAddress();
            System.out.println("local host is :" + s);
        }catch (IOException e){
            System.out.println("i dint know my local host");
        }
        System.out.println("______________________");

        InetAddress []in = InetAddress.getAllByName("www.facebook.com");
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }
}
