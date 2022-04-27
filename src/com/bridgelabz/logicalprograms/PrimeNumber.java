package com.bridgelabz.logicalprograms;

public class PrimeNumber {

    static Boolean check(int number) {
        int i, m = 0;
        int flag = 0;
        m = number / 2;

        if (number == 0 || number == 1) {
            return false;
        } else {
            for(i=2;i<=m;i++){
                if (number%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (check(i)) {
                System.out.println(i + " is a Prime number");
            }
        }
    }
}
