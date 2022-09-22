package com.firstassignment;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int useraction;
        do {
            System.out.println("1: Add");
            System.out.println("2: Sub");
            System.out.println("3: Exit!");
            System.out.println("4:Select an Option");
            useraction = sc.nextInt();
            switch (useraction) {
                case 1:
                    int a = 5, b = 6, c;
                    c = a + b;
                    System.out.println("Addition of two numbers are :" + c);
                    break;
                case 2:
                    int d = 5, e = 6, f;
                    f = d - e;
                    System.out.println("Addition of two numbers are :" + f);
                    break;
                case 3:
                    System.out.println("Exit the class");
                    break;
            }
        } while (useraction != 3);
    }
}
