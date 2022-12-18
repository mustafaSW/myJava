package com.Password;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	System.out.println("Enter your password :");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("Enter the password agen :");
		Scanner in1 = new Scanner(System.in);
		String str1 = in.nextLine();
		System.out.println(str.matches(str1));


    }
}
