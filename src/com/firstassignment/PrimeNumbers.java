package com.firstassignment;

import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int n , count=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count ++;
            }
        }
            if(count == 2)
            {
                System.out.println("The number is PrimeNumber");
            }
            else {
                System.out.println("The number is not PrimeNumber ");
            }
    }
}
