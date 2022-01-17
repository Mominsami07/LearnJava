package com.momin;

public class Max {
    public static void main(String[] args) {

        int [] arr={22,3,19,14,10};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));

    }

    static int max( int[] arr) {
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal)
                maxVal=arr[i];
        }
        return maxVal;
    }
    static int maxRange( int[] arr,int start,int end) {
        int maxVal=arr[start];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxVal)
                maxVal=arr[i];
        }
        return maxVal;
    }
}
