package com.Http_Https_URL_Connection4;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main{

    public static void main(String []args) throws IOException{

        URL url = new URL("https://developer.mozilla.org/en-US/docs/Web/HTTP/Status");
        HttpsURLConnection ht = (HttpsURLConnection)url.openConnection();
        Map<String ,List<String>> header = ht.getHeaderFields();
        Set<String> headerKey = header.keySet();
        for (String s:headerKey) {
            System.out.println("Key :"+s+" _value"+header.get(s));
        }
    }
}
