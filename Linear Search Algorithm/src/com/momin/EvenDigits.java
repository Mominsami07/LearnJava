package com.momin;

public class EvenDigits {
    public static void main(String[] args) {
        int [] arr={-12,324,2,6,-7896};
        System.out.println(CountEven(arr));
    }

    static int CountEven(int[]arr)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i]))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numOfDigits=CountDigits(num);

        return numOfDigits%2==0;
    }

    static int CountDigits(int num)
    {
        if(num<0)
        {
            num=num*-1;
        }
        return(int) (Math.log10(num))+1;
    }
}
