package com.factorial;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int nummer ;
        int ursprünglicheNummer ;
        int ergebnis = 0;
        int rest ;


        System.out.print("Geben Sie eine Zahl ein : ");
        nummer = in.nextInt();
        ursprünglicheNummer = nummer;
        while (nummer != 0){
            rest = nummer%10;
            ergebnis = ergebnis*10+rest;
            nummer /=10;
        }

        //Umgekehrtes Ergebnis
        System.out.println("die umgekehrte nummer von"+
                ursprünglicheNummer+" ist :"+ergebnis);

        //change the int to String
        String changeFN1 = String.valueOf(ursprünglicheNummer);
        String changeFN2 = String.valueOf(ergebnis);

         String palindrome = changeFN1 + changeFN2;
        System.out.println("die palindrome ist :"+palindrome);


    }
}
