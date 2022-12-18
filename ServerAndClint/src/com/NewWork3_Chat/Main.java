package com.NewWork3_Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    private static ServerSocket ss;
    public static void main(String[] args)throws IOException, ClassNotFoundException {

        ServerSocket ss = new ServerSocket(8899);
        System.out.println("Sever is listening.....");
        Socket s = ss.accept();
        OutputStream out = s.getOutputStream();
        ObjectOutputStream oout = new ObjectOutputStream(out);
        InputStream is  = s.getInputStream();
        ObjectInputStream oin = new ObjectInputStream(is);

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String r_msg,s_msg;
        while (true){
            //Client
            System.out.println("waiting cliebt to be connect.....");
            if ((r_msg = (String)oin.readObject())!=null){
                System.out.println("User says : "+r_msg);
            }
            System.out.println("to User:");
            s_msg = br.readLine();
            oout.writeObject(s_msg);
        }

    }
}
