package com.URL_Decoder_Encoder;

/*
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.print("Enter your URL :");
        Scanner in = new Scanner(System.in);
        String URL = in.nextLine();
        String decoder = URLDecoder.decode(URL,"UTF-8");

        System.out.println("decoded :"+decoder);
    }
}
//https://asgoodasnew.de/Apple-MacBooks/MacBook-Pro/MacBook-Pro-2017/Apple-MacBook-Pro-2017-13-Intel-Core-i5-2-30-GHz-128-GB-SSD-8-GB-silber.html?listtype=search&searchparam=macbook%20

 */

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main{

    public static void main(String []args) throws UnsupportedEncodingException {

        String s = "https://asgoodasnew.de/Apple-MacBooks/MacBook-Pro/" +
        "MacBook-Pro-2017/Apple-MacBook-Pro-2017-13-Intel-Core-i5-2-30" +
        "-GHz-128-GB-SSD-8-GB-silber.html?listtype=search&searchparam=macbook%20";

        System.out.println("Decoder : "+s);
        String sd = URLDecoder.decode(s,"UTF-8");
        System.out.print("decoded : "+sd);

    }
}