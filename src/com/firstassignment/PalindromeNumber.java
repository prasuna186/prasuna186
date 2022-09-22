package com.firstassignment;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int num1=num;
        int rev =0;
        while(num!=0)
        {
            rev = rev*10 + num%10;
            num=num/10;
        }
        if(num1 == rev)
        {
            System.out.println(num1 +"Palindrome Number");
        }
        else {
            System.out.println(num1 +"Not Palindrome Number");
        }
    }
}
