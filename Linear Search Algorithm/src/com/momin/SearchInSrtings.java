package com.momin;

public class SearchInSrtings {
    public static void main(String[] args) {
        String name="Momin";
        char target='o';
//        System.out.println(search(name,target));
        System.out.println(linearSearch2(name,target));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean linearSearch(String str, char target) {
        if(str.length()==0){ //if the arr is empty
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if(str.charAt(index)==target) {
                return true;
            }

        }
        return false; //if element not found return false
    }


    static boolean linearSearch2(String str,char target) {
        if(str.length()==0){ //if the arr is empty
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false; //if element not found return false
    }
}
