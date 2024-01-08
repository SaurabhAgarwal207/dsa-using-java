package com.saurabh.javabasics;

import java.util.Scanner;

public class PrintTableOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+num+" = "+(i*num));
        }
    }
}
