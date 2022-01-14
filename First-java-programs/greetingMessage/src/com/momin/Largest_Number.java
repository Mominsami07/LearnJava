package com.momin;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        float num1=input.nextFloat();
        float num2=input.nextFloat();

        if(num1>num2)
            System.out.println(num1+" is the largest between ("+num1+","+num2+")");
        else
            System.out.println(num2+" is the largest between ("+num1+","+num2+")");

    }
}
