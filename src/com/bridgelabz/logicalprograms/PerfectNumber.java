package com.bridgelabz.logicalprograms;

import java.util.*;

public class PerfectNumber {
    // Creating check() method that will return true when number will be perfect
    static boolean check(int number)
    {
        int sum = 1;

        // Finding all the divisors
        for (int j = 2; j * j <= number; j++)
        {
            if (number % j==0)
            {
                if(j * j != number)
                    sum = sum + j + number / j;
                else
                    sum = sum + j;
            }
        }
        // Checking whether the sum of the divisors and number both are equal or not
        if (sum == number && number != 1)
            return true;

        return false;
    }

    public static void main (String[] args)
    {
        System.out.println("Perfect numbers between 0-100:");
        for (int n = 2; n < 100; n++){
            if (check(n))
                System.out.println( n +" is a perfect number");
        }
    }
}
