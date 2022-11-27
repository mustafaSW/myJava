package com.Http_Https_URL_Connection;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class Main {

    public static void main(String[] args)throws IOException {

        URL url = new URL("https://www.google.com");
        HttpsURLConnection http = (HttpsURLConnection)url.openConnection();

        long date = http.getExpiration();
        if (date == 0){
            System.out.println("No Date");
        }
        else {
            System.out.println("Date : "+new Date(date));
        }
    }
}
