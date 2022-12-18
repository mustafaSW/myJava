package com.NewWork3_Chat;

import java.io.*;
import java.net.Socket;

public class Client {
private static Socket s;
    public static void main(String []args)throws IOException , ClassNotFoundException{

        Socket s = new Socket("localhost",8899);
        System.out.println("Connected");
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String r_msg , s_msg;
        while (true){
            //Server
            System.out.println("to Server :");
            s_msg=br.readLine();
            oos.writeObject(s_msg);
            //client
            System.out.println("waiting for connaction....");
            if ((r_msg =(String)ois.readObject())!=null){
                System.out.println("server says :"+r_msg);
            }

        }

    }
}
