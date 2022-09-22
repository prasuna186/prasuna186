package com.firstassignment;

import java.util.Scanner;

public class ColorCode {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your colour choice: ");
        char choice = in.next().charAt(0);
        switch (choice) {
            case 'V':
                System.out.println("Violet");
                break;

            case 'I':
                System.out.println("Indigo");
                break;

            case 'B':
                System.out.println("Blue");
                break;

            case 'G':
                System.out.println("Green");
                break;

            case 'Y':
                System.out.println("Yellow");
                break;

            case 'O':
                System.out.println("Orange");
                break;

            case 'R':
                System.out.println("Red");
                break;

            default:
                System.out.println("Incorrect choice");
        }
    }
}
