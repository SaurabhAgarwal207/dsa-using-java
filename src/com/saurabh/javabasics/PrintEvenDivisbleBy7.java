package com.saurabh.javabasics;

import java.util.Scanner;

public class PrintEvenDivisbleBy7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range");
        int range=scan.nextInt();
        for(int i=1;i<=range;i++){
            if(i%2==0 &&i%7==0)
                System.out.print(i+" ");
        }
    }
}
