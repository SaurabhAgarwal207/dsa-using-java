package com.saurabh.javabasics;

import java.util.Scanner;

public class SumUsingWhile {
    public static void main(String[] args) {
        System.out.println("Enter range");
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        int i=1,sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
