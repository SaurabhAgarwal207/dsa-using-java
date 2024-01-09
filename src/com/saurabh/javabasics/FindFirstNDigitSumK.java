package com.saurabh.javabasics;

import java.util.Scanner;

/*
take input N : number of records to find
having sum digit k
 */
public class FindFirstNDigitSumK {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int k=sc.nextInt();
            int count=0;
            int num=1;
            while(count<=N){
                int sum=0;
                for(int i=num;i>0;i/=10){
                   sum=sum+(i%10);
                }
                if(sum==k){
                    count++;
                }

            }
        }
    }


