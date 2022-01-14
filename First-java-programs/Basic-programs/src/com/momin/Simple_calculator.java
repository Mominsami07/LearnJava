package com.momin;

import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1=input.nextFloat();
        System.out.print("Enter second number: ");
        float num2=input.nextFloat();
        System.out.print("Choose operator (+,-,*,/): ");
        char operator=input.next().charAt(0);

        switch (operator)
        {
            case '+':
                System.out.println(num1 +" + "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.println(num1 +" + "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.println(num1 +" * "+num2+" = "+(num1*num2));
                break;
            case '/':
                if(num2==0)
                    System.out.println("Can not divide by Zero!");
                else
                    System.out.println(num1 +" / "+num2+" = "+(num1/num2));
                break;
        }

    }
}
