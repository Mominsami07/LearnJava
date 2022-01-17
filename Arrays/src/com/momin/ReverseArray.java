package com.momin;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {1,2,3,5,6,10};
        reverse(arr);
//        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }

     static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

//        for (int i = 0; i < arr.length-1; i++) {
//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
//        }
    }


}
