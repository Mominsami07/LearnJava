package com.momin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.print("Pleas enter your name: ");
        String name=input.nextLine();

        System.out.println("Hello, "+name);
    }
}
