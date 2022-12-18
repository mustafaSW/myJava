package com.put_URL;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://stackoverflow.com/");
        HttpsURLConnection ht = (HttpsURLConnection) url.openConnection();
        System.out.println(ht);
        BufferedReader bf=  new BufferedReader(new InputStreamReader(ht.getInputStream()));
        String in;
        while ((in = bf.readLine())!=null){
            System.out.println(in);

        }
        bf.close();
    }
}
