package com.Http_NewWork_URLConnetion;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args)throws IOException {
        URL url = new URL("https://getfedora.org");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();

        for (int i = 0; i < 10; i++) {
            System.out.println(http.getHeaderFieldKey(i)+"="+http.getHeaderField(i));
        }
        http.disconnect();
        
    }
}
