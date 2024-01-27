package com.saurabh.arrays;

public class ReverseArrayNormal {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        int nums[] = new int[numbers.length];
        int j=0;
        for(int i=numbers.length-1;i>=0;i--){
            nums[j]=numbers[i];
            j++;
        }
        for(int s=0;s<nums.length;s++)
            System.out.println(nums[s]);
    }
}
