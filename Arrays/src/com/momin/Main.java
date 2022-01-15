package com.momin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

//        System.out.print("Enter the size of the array: ");
//        int size=input.nextInt();
        //int [] arr=new int[size];
        int [][] arr2D=new int [3][3];
//        Create_Array(arr2D);
//        Display_arr(arr);
//        System.out.println();
//        System.out.println("Sum of Elements= "+Sum_arr(arr));
        Create_2D(arr2D);
        Display_arr2D(arr2D);
        Display_arr2Dv1(arr2D);

    }

//    static void Create_Array(int [] arr)
//    {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter element #"+(i+1)+": ");
//            arr[i]=input.nextInt();
//        }
//    }
//    static void Display_arr(int [] arr){
//        System.out.print(Arrays.toString(arr));
//    }
    static void Display_arr2D(int [][] arr2D){
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
//    static void Display_arr2D(int [][] arr2D){
//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col]+"  ");
//            }
//            System.out.println();
//        }
//    }
    static void Display_arr2Dv1(int [][] arr2D){
        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }
    }

//    static int Sum_arr(int [] arr){
//        int sum=0;
//        for (int j : arr) {
//            sum += j;
//        }
//        return sum;
//    }
    static void Create_2D(int [][]arr2D)
    {
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col <arr2D[row].length ; col++) {
                arr2D[row][col]=input.nextInt();
            }
        }
    }
}
