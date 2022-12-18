package com.IO_Zip_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args)throws IOException {

        FileInputStream fin = new FileInputStream("mustafa.txt");
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("/Users/Ibraheem/Desktop/zip.zip"));
        out.putNextEntry(new ZipEntry("mustafa.txt"));

        byte []buffer = new byte[1024];
        int i;
        while ((i=fin.read(buffer)) > -1){
            out.write(buffer,0,i);
        }
        System.out.println("Done");
        out.closeEntry();
        fin.close();
        out.close();
    }
}
