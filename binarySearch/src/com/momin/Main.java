package com.momin;

public class Main {

    public static void main(String[] args) {

        int [] arr={9,11,15,22,48,50,56,62,78,99};
        int target=50;
        int ans= binarySearch(arr,target);
        System.out.println(ans);
    }

//    assume that the array in increasing order
    static int binarySearch(int [] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
//            int mid= (start+end)/2; // it might be possible that (start+end)exceeds the range of int in Java
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
