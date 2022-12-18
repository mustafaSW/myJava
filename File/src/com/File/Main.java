package com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        try {
        FileInputStream f = null;
        FileOutputStream o = null ;

            f = new FileInputStream("mu.txt");
            o = new FileOutputStream("new.txt");

            String s = "";
             System.out.println(s);

            int i;
            while ((i = f.read()) != -1) {
                System.out.println((char)i);
                s = s+(char)i;
            }
            System.out.println(s);
           s = s.replaceAll("hi","mustafa");
            System.out.println(s);
            int c;
            for (i = 0;i< s.length();i++) {
                System.out.println(s.charAt(i));
                c=s.charAt(i);
                System.out.println(c);
                o.write(c);
            }
            f.close();
            o.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
