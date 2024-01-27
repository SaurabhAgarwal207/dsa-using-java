package com.saurabh.arrays;

public class ArrayPairs {
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        findPairs(array);
    }
    public static void findPairs(int arr[]){
        int tp=0;
        for(int start=0;start<arr.length;start++){
            for(int end=start+1;end<arr.length;end++){
                System.out.print("("+arr[start]+","+arr[end]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+tp);
    }
}
