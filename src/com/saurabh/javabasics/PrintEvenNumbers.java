package com.saurabh.javabasics;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range");
        int range = scan.nextInt();
        for(int i=2;i<=range;i+=2)
            System.out.print(i+" ");
        //Another way
        System.out.println();
        for(int i=1;i<=range;i++){
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}
