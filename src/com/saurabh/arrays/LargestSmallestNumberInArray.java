package com.saurabh.arrays;

public class LargestSmallestNumberInArray {
    public static void main(String[] args) {
        int arr[]={1,4,7,3,9,2,6};
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Max is : "+max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Min = "+min);
    }
}
