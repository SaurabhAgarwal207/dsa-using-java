package com.saurabh.arrays;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,24,26,18,22};
        int key =5;
        int index= search(arr,key);
        if(index==-1)
            System.out.println(key+" is not present in array");
        else
        System.out.println(key+" is present at location "+index);

    }
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
