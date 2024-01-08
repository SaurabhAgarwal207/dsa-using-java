package com.saurabh.javabasics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        int fact = 1;
        for (int i = 2; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is : " + fact);
    }
}
