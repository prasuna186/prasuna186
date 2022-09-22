package com.firstassignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //To check if a given number is odd or even
       // int num = 9;
        // If number is divisible by 2 then it's an even number else odd number
        //if(num % 2 == 0)
        //{
          //  System.out.println("The number is even");
        //}
        //else
          //  System.out.println("The number is odd");
        int num;
        System.out.println("Enter the number");
        //Input stored in the scanner class num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        // If number is divisible by 2 then it's an even number else odd number
        if(num % 2 == 0)
        {
          System.out.println("The number is even");
        }
        else
          System.out.println("The number is odd");
    }
}
