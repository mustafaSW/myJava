package com.https_client;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.Certificate;

public class Main {

    public static void main(String[] args) {

        Main hc = new Main();
        hc.check();
    }
    private void check(){
        String https = "https://www.facebook.com";
        URL url ;

        try {
            url = new URL(https);
            HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
            https_cert(con);
            print_content(con);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void https_cert(HttpsURLConnection con) {

        if (con != null){
            try {
                System.out.print("getResponseCode :"+con.getResponseCode());
                System.out.print("Cipher :"+con.getCipherSuite());
                System.out.print("");

                java.security.cert.Certificate []cert = con.getServerCertificates();
                for (Certificate certificate:cert) {
                    System.out.println("cert Type :"+certificate.getType());
                    System.out.println("cert hash code :"+certificate.hashCode());
                    System.out.println("public key :"+certificate.getPublicKey().getAlgorithm());
                    System.out.println("key format :"+certificate.getPublicKey().getFormat());
                    System.out.print("");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void print_content(HttpsURLConnection con){

        if (con != null){
            System.out.println("-------------URL content----------------");
            try {
                BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String in;
                while ((in=bf.readLine())!=null){
                    System.out.println(in);
                 }
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
