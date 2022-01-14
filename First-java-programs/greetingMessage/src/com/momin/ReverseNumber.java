package com.momin;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int n=input.nextInt();
        int res=0;
        while(n>0)
        {
            int currNumber=n%10;
            res=res*10+currNumber;
            n/=10;
        }
        System.out.println(res);
    }
}
