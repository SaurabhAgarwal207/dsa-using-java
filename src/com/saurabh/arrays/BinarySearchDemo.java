package com.saurabh.arrays;

public class BinarySearchDemo {

    public static int doBinarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key)
                return mid;
            else if(numbers[mid]<key)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key =4;
        int place=doBinarySearch(arr,key);
        if(place==-1)
            System.out.println("not found");
        else
        System.out.println(place);
    }
}
