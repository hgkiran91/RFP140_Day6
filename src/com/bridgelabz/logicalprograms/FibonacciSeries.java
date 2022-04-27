package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int count=input.nextInt();
        int sum=0;

        for(int i=0; i<count; i++)
        {
            System.out.println(sum+=i);
        }
        //System.out.println(sum);
    }
}
