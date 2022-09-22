package com.firstassignment;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 6;
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;

            }
            if (count == 2) {
                System.out.println("Print Number");
            } else {
                System.out.println("Not Prime Number");
            }

        }
    }
}