package com.NewWork_MyTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            Socket s = ss.accept();
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            String server,client;
            do {
                client = in.readUTF();
                System.out.println("client :"+client);
                bf.readLine();
                out.writeUTF(client);
                out.flush();
            }while (!client.equals("stop"));
            in.close();
            s.close();
            ss.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}






