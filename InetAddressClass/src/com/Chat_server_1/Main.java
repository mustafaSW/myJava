package com.Chat_server_1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args){
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
            System.out.println(address);
        } catch (UnknownHostException e) {
            System.out.println("can not find the local address ");
        }
    }
}
