package com.momin;

import java.util.Scanner;

public class Simple_Insert {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        float principal=input.nextFloat();
        System.out.print("Enter time units: ");
        float time=input.nextFloat();
        System.out.print("Enter rate: ");
        float rate=input.nextFloat();

        float SI= (principal*time*rate)/100;

        System.out.println("Simple Insert = " + SI);

    }
}
