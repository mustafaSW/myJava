package com.Chat_server_client_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {

    private static DatagramSocket datagramSocket;
    private static int port = 0410;
    private static InetAddress host;
    private static DatagramPacket inpacket,outpacket;
    private static byte []buffer ;

    public static void main(String []args)throws IOException {

        host = InetAddress.getLocalHost();

        accesServer();

    }

    private static void accesServer()throws IOException {

        datagramSocket = new DatagramSocket();
        Scanner userEntery =new Scanner(System.in);
        String message =" ",recponse="";
        do {
            System.out.print("Enter message :");
            message = userEntery.nextLine();
            if (! message.equalsIgnoreCase("close")){
                outpacket = new DatagramPacket(message.getBytes(),message.length(),host,port);
                datagramSocket.send(outpacket);
                buffer = new byte[256];
                inpacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(inpacket);
                recponse = new String(inpacket.getData(),0,inpacket.getLength());
                System.out.println("from SERVER "+recponse);
            }
        }while (!message.equalsIgnoreCase("close"));
        System.out.println("closing");
        datagramSocket.close();
    }
}
