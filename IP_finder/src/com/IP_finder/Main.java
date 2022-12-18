package com.IP_finder;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Beispiel : google.com
        System.out.print("enter the domain :");
        Scanner in = new Scanner(System.in);
        String domain = in.nextLine();
        try {
            InetAddress address = InetAddress.getByName(domain);
            System.out.print("the IP is : "+address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
