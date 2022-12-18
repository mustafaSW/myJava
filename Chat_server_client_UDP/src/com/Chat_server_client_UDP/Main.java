package com.Chat_server_client_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {
    private static final int port = 0410;
   private static DatagramSocket datagramSocket;
    private static DatagramPacket inpacket,outpacket;
    private static byte []buffer;
    public static void main(String[] args) {

	System.out.println("opening port...../r");
        try {
            datagramSocket = new DatagramSocket(port);
        } catch (SocketException e) {
            System.out.println("wrong port number");
            System.exit(1);
        }
        handelclient();
    }

    private static void handelclient() {
        int messagenum = 0;
        String messagein,messageout;
        do {
            buffer = new byte[256];
            inpacket = new DatagramPacket(buffer, buffer.length);
            try {
                datagramSocket.receive(inpacket);
            } catch (IOException e) {
                System.out.println("no inpacket");
            }

            InetAddress client = inpacket.getAddress();
            int clientport = inpacket.getPort();
            messagein = new String(inpacket.getData(),0,inpacket.getLength());
            System.out.print("message recieved: \n");
            messagenum++;
            messageout = "message :"+messagenum+">"+messagein;
            outpacket = new DatagramPacket(messageout.getBytes(),messageout.length(),client,clientport);
            try {
                datagramSocket.send(outpacket);
            } catch (IOException e) {
                System.out.println("can not send");
            }
        }while (true);
    }
}
