package com.interface_new5;

import java.io.IOException;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException {

        Enumeration<NetworkInterface>nf = NetworkInterface.getNetworkInterfaces();
        while (nf.hasMoreElements()){
            NetworkInterface ni = nf.nextElement();
            netParameters(ni);
        }
    }
    private static void netParameters(NetworkInterface ni) throws SocketException {
    System.out.println("Name :"+ni.getName());
        System.out.println("displayName :"+ni.getDisplayName());
        System.out.println("lo :"+ni.isLoopback());
        System.out.println("MUT :"+ni.getMTU());
        System.out.println("virtual :"+ni.isVirtual());
        System.out.println("pointToPoint"+ni.isPointToPoint());
        System.out.println("hardWareAddress :"+ni.getHardwareAddress());
        System.out.println("multiCast :"+ni.supportsMulticast());
        System.out.println("Active :"+ni.isUp());
        List<InterfaceAddress>list =ni.getInterfaceAddresses();
        Iterator<InterfaceAddress> iterator = list.iterator();
        while (iterator.hasNext()){
            InterfaceAddress ia = iterator.next();
            System.out.println("getAddress :"+ia.getAddress());
            System.out.println("getNetworkPrefixLength :"+ia.getNetworkPrefixLength());
            System.out.println("getBroadcast :"+ia.getBroadcast());
            System.out.println(".......");
        }

    }
}
