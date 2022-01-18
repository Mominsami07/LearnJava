package com.momin;

public class SearchInRange {
    public static void main(String[] args) {
        int [] nums={42,15,18,66,10,1,2};
        int target=10;
        System.out.println(linearSearch(nums,target,1,4));
    }

    static boolean linearSearch(int[] arr, int target,int start,int end) {
        if(arr.length==0){ //if the arr is empty
            return false;
        }
        for (int index = start; index <= end; index++) {
            int element=arr[index];
            if(element==target) {
                return true;
            }

        }
        return false; //if element not found return false
    }

    static int linearSearch1(int[] arr,int target,int start,int end) {
        if(arr.length==0){ //if the arr is empty
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element=arr[index];
            if(element==target) {
                return index;
            }

        }
        return -1; //if element not found return -1
    }
}
