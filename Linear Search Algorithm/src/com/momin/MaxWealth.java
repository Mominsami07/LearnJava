package com.momin;

public class MaxWealth {
    public static void main(String[] args) {
        int [][]arr={{1,5},{7,3},{3,5}};
//        richestCustomer(arr);
        System.out.println(richestCustomer(arr));
    }


     static int richestCustomer(int[][] arr) {
        int ans=Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             int sum=0;
             for (int j = 0; j < arr[i].length; j++) {
                    sum=sum+arr[i][j];
             }
            if(sum>ans)
            {
                ans=sum;
            }
         }
         return ans;
    }
}
