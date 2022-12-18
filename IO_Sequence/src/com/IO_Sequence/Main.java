package com.IO_Sequence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {


        FileInputStream in1 = new FileInputStream("salary111.txt");
        FileInputStream in2 = new FileInputStream("salary222.txt");
        FileInputStream in3 = new FileInputStream("salary333.txt");
        FileInputStream in4 = new FileInputStream("salary444.txt");

        Vector<FileInputStream> vec = new  Vector<FileInputStream>();
        vec.add(in1);
        vec.add(in2);
        vec.add(in3);
        vec.add(in4);

        Enumeration en = vec.elements();
        SequenceInputStream sq = new SequenceInputStream(en);


        int i = 0;
        while ((i=sq.read()) != -1){
             System.out.print((char)i);
        }

        sq.close();
        in1.close();
        in2.close();
        in3.close();
        in4.close();

    }
}




