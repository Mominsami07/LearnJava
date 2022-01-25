package com.momin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,5},
                {12,13,14,16},
                {20,21,22},
                {15,16}
        };
        int target=99;
        int []ans=linearSearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int [] linearSearch(int[][]arr,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }


}
