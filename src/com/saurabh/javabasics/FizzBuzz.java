package com.saurabh.javabasics;

import java.util.Scanner;
/*Given a number N, iterate i = 1 to N:
Print “FizzBuzz” if i is a multiple of both 3 and 5.
Print “Fizz” if i is a multiple of 3 only.
Print “Buzz” if i is a multiple of 5 only.
Otherwise, print the value of i.
*/
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter range");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if (i%3==0)
                System.out.println("Fizz");
            else if (i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }
    }
}
