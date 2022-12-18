package com.getAllByName_Buffer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        try {
            InetAddress []addresses = InetAddress.getAllByName("www.apple.com");
            for (int i = 0; i < addresses.length; i++) {
                System.out.println(addresses[i]);
            }

        } catch (UnknownHostException e) {
            System.out.println("can not find any think ....");
        }
    }
}
