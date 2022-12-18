package com.NetWork_newURL_method;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Scanner;

/*
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {
        URI uri = new URI("https://harmash.com/java/java-generics/example-2.php");
        System.out.println("Auth :"+uri.getAuthority());
        System.out.println("Fragment :"+uri.getFragment());
        System.out.println("Host :"+uri.getHost());
        System.out.println("Path :"+uri.getPath());
        System.out.println("Query :"+uri.getQuery());
        System.out.println("Scheme :"+uri.getScheme());
        System.out.println("SchemeSpecificPart :"+uri.getSchemeSpecificPart());
        System.out.println("UserInfo :"+uri.getUserInfo());
        System.out.println("Absolute :"+uri.isAbsolute());
        System.out.println("Opaque :"+uri.isOpaque());
        System.out.println("Port :"+uri.getPort());

    }
}
//URL url = new URL("http","hostName",80,"index.html");
  //      URL url1 = new URL("http://hostName.80/index.html");
 */


class Urlinfo{
    public static void info(URL url) throws IOException {

        URLConnection c = url.openConnection();
        c.connect();
        System.out.println("ContentType :"+c.getContentType());
        System.out.println("Content Encoding :"+c.getContentEncoding());
        System.out.println("Content length :"+c.getContentLength());
        System.out.println("Date :"+ new Date(c.getDate()));
        System.out.println("last mMdiFined :"+new Date(c.getLastModified()));
        System.out.println("Expiration :"+ new Date(c.getExpiration()));

        if (c instanceof HttpURLConnection){
            HttpURLConnection h = (HttpURLConnection)c;
            System.out.println("request Method :"+h.getRequestMethod());
            System.out.println("response massage :"+h.getResponseMessage());
            System.out.println("response code :"+h.getResponseCode());
        }
    }
}
public class Main{

    public static void main(String []args) throws IOException {
        Urlinfo.info(new URL("https://developer.android.com/codelabs/android-training-using-debugger?index=..%2F..%2Fandroid-training#4"));
    }
}






/*
class Urlinfo{
    public static void info(URL url) throws IOException{
        URLConnection c = url.openConnection();
        c.connect();
        System.out.println("ContentLength : "+c.getContentLength());
        System.out.println("LastModified : "+c.getLastModified());
        System.out.println("ContentEncoding : "+c.getContentEncoding());
        System.out.println("ContentType : "+c.getContentType());
        System.out.println("InputStream : "+c.getInputStream());
        System.out.println("Date : "+new Date(c.getDate()));

        if (c instanceof HttpURLConnection){
            System.out.println("RequestMethod : "+((HttpURLConnection) c).getRequestMethod());
            System.out.println("Permission :"+c.getPermission());
        }
    }
}

public class Main{

    public static void main(String []args)throws IOException{

         Urlinfo.info(new URL("https://developer.android.com/codelabs/android-training-using-debugger?index=..%2F..%2Fandroid-training#4"));
        // Urlinfo.info(new URL("https://harmash.com/java/java-generics/example-2.php"));
    }
}

 */

