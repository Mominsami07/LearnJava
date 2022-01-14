package com.momin;

import java.util.Scanner;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1=input.nextInt();
        System.out.print("Enter second integer: ");
        int num2=input.nextInt();

        int sum=num1+num2;
        System.out.println(num1 +" + "+num2 +" = "+sum);
    }
}
