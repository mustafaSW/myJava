package com.InetAddresses2;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args)throws IOException {
        InetAddress iq = InetAddress.getByName("www.google.iq");
        InetAddress us = InetAddress.getByName("www.google.us");

        if (iq.equals(us)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
    }
}
