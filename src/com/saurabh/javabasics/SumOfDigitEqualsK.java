package com.saurabh.javabasics;
// Given a value n print only those numbers from 1 to N whose sum is equal to K
public class SumOfDigitEqualsK {
    public static void main(String[] args) {
        int n = 30, k = 9;
        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            while (temp > 0) {
                int a = temp % 10;
                sum = sum + a;
                temp = temp / 10;
            }
            if (sum == k)
                System.out.println(i);
        }
    }
}
