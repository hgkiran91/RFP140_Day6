package com.bridgelabz.logicalprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class CouponNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many coupons you want to generate : ");
        int numOfCoupon = scanner.nextInt();

        randomCoupon(numOfCoupon);
    }

    public static void randomCoupon(int numOfCoupon) {
        ArrayList<Integer> couponList = new ArrayList<>();
        int i = 0;
        while (numOfCoupon > i) {
            int randomNumber = (int) Math.floor(Math.random() * 1000);
            if (!couponList.contains(randomNumber)) {
                couponList.add(randomNumber);
                i++;
            }
        }
        for (int coupon : couponList) {
            System.out.println(coupon);
        }
    }
}
