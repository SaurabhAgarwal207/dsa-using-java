package com.saurabh.arrays;

public class PrintSubarrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        findSubArrays(arr);
    }
    public static void findSubArrays(int arr[]){
        int ts=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                if(sum<min)
                    min=sum;
                if(sum>max)
                    max=sum;
                System.out.println("[Sum of subarray is : "+sum+" ]");
                ts++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays : "+ts);
        System.out.println("Max sum is : "+max);
        System.out.println("Min sum is : "+min);
    }
}
