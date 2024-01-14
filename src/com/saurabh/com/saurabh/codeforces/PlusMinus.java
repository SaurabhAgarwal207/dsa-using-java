package com.saurabh.com.saurabh.codeforces;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a, b, c;
        while (t > 0) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if(a+b==c)
                System.out.println("+");
            else
                System.out.println("-");
            t--;

        }
    }
}
