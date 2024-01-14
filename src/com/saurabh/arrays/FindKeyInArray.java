package com.saurabh.arrays;

public class FindKeyInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,80,60,70};
        int key=80;
        int index=searchKey(arr,key);
        System.out.println(index==-1?(key+ " is not present in array"):(key+" is present at index "+index));
    }
    public static int searchKey(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}
