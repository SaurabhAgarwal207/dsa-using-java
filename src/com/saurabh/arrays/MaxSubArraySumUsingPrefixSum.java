package com.saurabh.arrays;

public class MaxSubArraySumUsingPrefixSum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        findMaxSubArraySum(arr);
    }
    public static void findMaxSubArraySum(int arr[]){
        int prefix[]= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum)
                    maxSum = currSum;
            }
        }
        System.out.println("Max sum : "+maxSum);
    }
}
