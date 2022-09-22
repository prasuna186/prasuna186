package com.firstassignment;

import java.util.Scanner;

public class DivisibleNumber
{
    public static void main(String[] args)
    {
        {
            System.out.println("\n\nDivided by 2,3 & 5: ");
            for (int i=1; i<=150; i++) {
                if (i%2==0 && i%3==0 && i%5==0)
                    System.out.print(i +", ");
            }
            System.out.println("\n");
        }

    }
}


