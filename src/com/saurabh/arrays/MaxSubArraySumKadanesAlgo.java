package com.saurabh.arrays;

public class MaxSubArraySumKadanesAlgo {
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        kadanesAlgo(numbers);
    }

    private static void kadanesAlgo(int[] numbers) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){

            currSum=currSum+numbers[i];
            if(currSum<0)
                currSum=0;
            if(currSum>maxSum)
                maxSum=currSum;
        }
        System.out.println("Max Sum = "+maxSum);
    }
}
