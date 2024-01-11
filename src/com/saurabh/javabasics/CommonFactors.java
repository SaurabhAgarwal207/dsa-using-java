package com.saurabh.javabasics;

import java.util.Scanner;

public class CommonFactors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int min = Math.min(num1, num2);
        int cnt = 1;
        for (int i = 2; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                cnt++;
        }
        System.out.println(cnt);
    }

}
