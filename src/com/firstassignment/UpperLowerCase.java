package com.firstassignment;

import java.util.Scanner;

public class UpperLowerCase {

    public static void main(String[] args) {
        int i, len;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        len = str.length();
        for (i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                System.out.println(Character.toUpperCase(ch));
            }

        }
    }
}

