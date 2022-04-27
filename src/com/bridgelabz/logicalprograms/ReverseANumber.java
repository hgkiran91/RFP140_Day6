package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseANumber {
    //Creating performReverse() method to reverse a number
    public static void performReverse(int number){
        int rev = 0;
        int temp = number;
        while(number != 0)
        {
            //Calculating reminder
            int rem = number % 10;
            //multiplying variable reverse by 10 and adding the reminder into it
            rev = rev * 10 + rem;
            //Divide the number
            number = number/10;
        }
        System.out.println(rev+" is the reverse of the number "+temp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers to reverse: ");
        int number = sc.nextInt();

        //Calling performReverse() method to perform reverse
        performReverse(number);
    }
}
