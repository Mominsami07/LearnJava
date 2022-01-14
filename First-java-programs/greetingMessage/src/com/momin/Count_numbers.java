package com.momin;

import java.util.Scanner;

public class Count_numbers {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the integer you want to check: ");
        long num =input.nextLong();
        System.out.print("Enter the digit: ");
        int occurrenceNum=input.nextInt();
        int count=0;
        while (num >0)
        {
            long currentNum=num%10;
            if(currentNum==occurrenceNum)
                count++;
        num/=10;
        }
        System.out.println("The digit "+occurrenceNum+ " was occurrences repeated "+count+" times");
    }
}
