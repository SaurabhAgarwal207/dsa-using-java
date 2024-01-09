package com.saurabh.javabasics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        boolean flag =false;
        int num=scan.nextInt();
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                flag =true;
                break;
            }
        }
        if(flag==false)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
