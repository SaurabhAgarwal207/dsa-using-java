package com.saurabh.javabasics;

import java.util.Scanner;

public class SumOfDigitsUptoRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range");
        int range = scan.nextInt();
        for (int temp = 1; temp <= range; temp++) {
            int i=temp;
            int sum = 0;
            int rem = 0;
            while (i != 0) {
                rem = i % 10;
                sum = sum + rem;
                i = i / 10;
            }
            System.out.println(sum);
        }
    }
}
