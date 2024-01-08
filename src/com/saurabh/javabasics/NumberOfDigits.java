package com.saurabh.javabasics;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int count=0;
        for(;num!=0;num/=10)
            count++;
        System.out.println("Total number of digits : "+count);
    }
}
