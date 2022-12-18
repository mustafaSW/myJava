package com.factorial;

import java.io.*;

public class Main {
    public static void main(String[] args) {

       final String PL1 = "abcd";
        final String PL2 = "efg";
        final String PL3 = "hij";
        final String PL4 = "klm";
        final String PL = PL1+PL2+PL3+PL4;
        try {
            File file = new File("/Users/Ibraheem/Desktop/myPassWord");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            if (! file.isFile())
                file.createNewFile();

            for (int k = 0; k <PL.length() ; k++) {
                String pw = PL.charAt(k) + "\n";
                System.out.print(pw);
                writer.write(pw);


                for (int j = 0; j < PL.length(); j++){
                    String pw2 = PL.charAt(k) + "" + PL.charAt(j) + "\n";
                    System.out.print(pw2);
                    writer.write(pw2);



                    for (int i = 0; i < PL.length(); i++) {
                        //System.out.println('\u03A9');
                        String pw3 = PL.charAt(k) + "" + PL.charAt(j) + "" + PL.charAt(i) + "\n";
                        System.out.print(pw3);
                        writer.write(pw3);

                        for (int f = 0; f < PL.length(); f++) {
                            String pw4 = PL.charAt(k) + "" + PL.charAt(j) + "" + PL.charAt(i) + PL.charAt(f) +"\n";
                            System.out.println(pw4);
                            writer.write(pw4);

                        }
                    }
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.close();
            writer.close();
            System.out.println("Nummber of Passwords = "+Math.pow(PL.length(),4));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
