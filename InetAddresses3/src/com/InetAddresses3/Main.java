package com.InetAddresses3;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args)throws IOException {

        InetAddress id = InetAddress.getByName("www.google.com");
        System.out.println("getHostName "+id.getHostName());
        System.out.println("getHostAddress "+id.getHostAddress());
        System.out.println("getAddress "+id.getAddress());
        System.out.println("isReachable "+id.isReachable(200));
        System.out.println("getCanonicalHostName "+id.getCanonicalHostName());
        System.out.println("isAnyLocalAddress "+id.isAnyLocalAddress());
    }
}
