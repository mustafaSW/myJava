package com.NewWork_MyTest;

import java.io.*;
import java.net.Socket;


public class Client{

    public static void main(String []args) {

        try {
            Socket s = new Socket("localhost", 5555);
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String server,client;
            do {
                client = bf.readLine();
                out.writeUTF(client);
                out.flush();
                server = in.readUTF();
                System.out.println("Server :"+server);
            }while (!client.equals("stop"));
            in.close();
            s.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}





