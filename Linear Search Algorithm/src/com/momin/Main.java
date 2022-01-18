package com.momin;

public class Main {

    public static void main(String[] args) {
        int [] nums={42,15,18,66,10,1,2};
        int target=1;
        System.out.println(linearSearch2(nums,target));

    }

    //linear search ....return the index of targeted element.
    static int linearSearch(int[] arr,int target) {
        if(arr.length==0){ //if the arr is empty
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target) {
                return index;
            }

        }
        return -1; //if element not found return -1
    }

    //linear Search .... boolean
    static boolean linearSearch1(int[] arr,int target) {
        if(arr.length==0){ //if the arr is empty
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target) {
                return true;
            }

        }
        return false; //if element not found return false
    }

    //search the target and return the  element
    static int linearSearch2(int[] arr,int target) {
        if(arr.length==0){ //if the arr is empty
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if(element==target) {
                return element;
            }

        }
        return Integer.MAX_VALUE; //if element not found return -1
    }
}

