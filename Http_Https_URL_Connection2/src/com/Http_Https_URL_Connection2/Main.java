package com.Http_Https_URL_Connection2;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

public class Main {

    public static void main(String[] args)throws IOException {

        URL url = new URL("https://www.google.com");
        HttpsURLConnection https = (HttpsURLConnection)url.openConnection();
        long date = https.getLastModified();
        if (date == 0){
            System.out.println("No modi");
        }
        else {
            System.out.println("modi"+new Date(date));
        }
    }
}
